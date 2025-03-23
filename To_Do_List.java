package Project;
import java.util.*;
public class Updated_Task_Manager
{
    // Manager class where all functions of backend is present
    public static class MANAGER
    {
        Map<Integer,String> task=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        // Mainmenu Function which is direction to user for using code
        public void Mainmenu()
        {
            System.out.println("Click 1 to 'ADD TASK':");
            System.out.println("Click 2 to 'REMOVE TASK':");
            System.out.println("Click 3 to 'CHECK TASK':");
            int check=sc.nextInt();
            if(check==1)
            {
                Addtask();
            }else if(check==2)
            {
                Removetask();
            }
            else if(check==3)
            {
                Check_Task();
            }else
            {
                System.out.println("Invalid Input");
                System.out.println();
                Mainmenu();
            }
        }

        // Addtask function allows user to add task according to priority
        public void Addtask()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Assign priority number to the task:");
            int priority_no=sc.nextInt();
            
            System.out.println("Write a task you want to assign:");
            //sc.nextLine();
            sc.nextLine();
            String stt=sc.nextLine();

            if(task.isEmpty())
            {
                task.put(priority_no,stt);
            }
            else
            {
                if(task.containsKey(priority_no))
                {
                    System.out.println("You have task of same priority ,Press '1' to override that task or Press '0' and assign new priority or remove");
                    int check=sc.nextInt();
                    if(check==1)
                    {
                        task.put(priority_no,stt);
                        System.out.println("Task is overrided");
                    }else
                    {
                        System.out.println();
                        Mainmenu();
                    }
                    System.out.println();
                    Mainmenu();
                }
            else
            {
                task.put(priority_no,stt);
            }}
            System.out.println();
            Mainmenu();
        }

        // Removetask function to remove completed task 
        public void Removetask()
        {
            System.out.println("Enter proirity number you want to remove:");
            int remove_pr=sc.nextInt();
            if(task.containsKey(remove_pr))
            {
                task.remove(remove_pr,task.get(remove_pr));
            }
            System.out.println();
            Mainmenu();
        }

        // Check_task function to see our Task_List
        public void Check_Task()
        {   
            if(task.isEmpty())
            {
                System.out.println("No task");
            }
            System.out.println();
            System.out.println("Your tasks to complete are:");
            for(Map.Entry<Integer,String> e:task.entrySet())
            {
                System.out.println(e.getKey()+"-"+e.getValue());
            }
            System.out.println();
            Mainmenu();
        }
        
    }
    public static void main(String[] args)
    {
        MANAGER mt=new MANAGER();
        mt.Mainmenu();
    }
}