package Assignment4.module11;
import java.util.LinkedList;
import java.util.Queue;


class PrintJob {
    int jobId;
    String document;

    PrintJob(int jobId, String document) {
        this.jobId = jobId;
        this.document = document;
    }
}

public class Question5{

    Queue<PrintJob> queue = new LinkedList<>();


    void addJob(int id, String doc) {
        PrintJob job = new PrintJob(id, doc);
        queue.add(job);
        System.out.println("Job " + id + " added: " + doc);
    }


    void processJob() {
        if (queue.isEmpty()) {
            System.out.println("No jobs in queue");
            return;
        }

        PrintJob job = queue.poll();
        System.out.println("Printing Job " + job.jobId + ": " + job.document);
    }


    void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Current Print Queue:");
        for (PrintJob job : queue) {
            System.out.println("Job " + job.jobId + " -> " + job.document);
        }
    }

    public static void main(String[] args) {
        Question5 printer = new Question5();

        printer.addJob(1, "Document1.pdf");
        printer.addJob(2, "Image.png");
        printer.addJob(3, "Report.docx");

        printer.displayQueue();

        printer.processJob();
        printer.processJob();

        printer.displayQueue();
    }
}