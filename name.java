public class name {
    public static void main(String[] args) {
        int n=7;
        for(int i=0;i<n;i++){
                if(i==0 || i==3){
                    for(int j=0;j<3;j++){
                        System.out.print("* ");
                    }
                    System.out.print("  ");
                    System.out.println();
                }
                if(i==1 || i==2){
                    for(int j=0;j<4;j++){
                        if(j==0 || j==3){
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                if(i==5 || i==4){
                    for(int j=0;j<4;j++){
                        if(j==0){
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
                
                if(i==6){
                    for(int j=0;j<4;j++){
                        if(j==0){
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
        }

        for(int i=0;i<6;i++){
            if(i==0 || i==5){
                for(int j=0;j<4;j++){
                    if(j==1 || j==2){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }                    
                }
                System.out.println();
            }
            if(i==1 || i==4){
                for(int j=0;j<4;j++){
                    if(j==0 || j==3){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            if(i==2){
                for(int j=0;j<4;j++){
                    if(j==1){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            if(i==3){
                for(int j=0;j<4;j++){
                    if(j==2){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
    }
}
