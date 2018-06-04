package fundamental.enumpack;

public enum BasicDirection implements Direction{
    EAST{
        @Override
        public void showDirection() {
            System.out.println("I am in EAST");
        }
    },

    WEST{
        @Override
        public void showDirection() {
            System.out.println("I am in WEST");
        }
    },

    NORTH{
        @Override
        public void showDirection() {
            System.out.println("I am in NORTH");
        }
    },

    SOUTH{
        @Override
        public void showDirection() {
            System.out.println("I am in SOUTH");
        }
    }
}
