package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "esty";
        String zones = "us-east-1,us-west-2,us-west-1";

        System.out.println("-----Starting deployment to etsy app to AWS zones -----");
        String[] zonesToDeploy = zones.split(",");
        for (String eachZone : zonesToDeploy) {
            System.out.println("Deploying [" + app + "] to " + eachZone);
            System.out.println("Deployment completed for " + eachZone);
        }
        System.out.println("-----All Deployments Complete-----");
    }
}
