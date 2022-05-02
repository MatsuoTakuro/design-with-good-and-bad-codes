package Ch4;

import java.util.ArrayList;
import java.util.List;

public class States {
    List<StateType> list;

    States(List<StateType> states) {
        this.list = states;
    }

    States() {
        final List<StateType> empty = new ArrayList();
        this.list = empty;
    }

    void add(StateType state) {
        // prefer to return new States?
        list.add(state);
    }

}
