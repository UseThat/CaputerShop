package model;

public class Computer {
    private String producer;
    private int model;

    public Computer(String producer, int model){
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (model != computer.model) return false;
        return producer != null ? producer.equals(computer.producer) : computer.producer == null;
    }

    @Override
    public int hashCode() {
        int result = producer != null ? producer.hashCode() : 0;
        result = 31 * result + model;
        return result;
    }
}
