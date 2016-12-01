package dao;

import model.Director;

/**
 * Created by Nick_Shapkin on 29.11.2016.
 */

public class DirectorDao {
    private Director[] directors = new Director[0];

    public void add(Director director) {
        int idx = indexOf(director);
        if (idx == -1) {

            Director[] tmp = new Director[directors.length + 1];
            tmp[0] = director;
            for (int i = 1; i < tmp.length; i++) {
                tmp[i] = directors[i - 1];
            }


            directors = tmp;
        } else

        {
            update(director);
        }
    }

    public int indexOf(Director director) {
        int idx = -1;
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getName().equals(director.getName())) {
                idx = i;
                break;
            }
        }
        return idx;
    }

    public Director[] getAll() {
        return directors;
    }

    //delete director
    public void remove(Director director) {
        int idx = indexOf(director);
        Director[] tmp = new Director[directors.length - 1];
        int k = 0;
        for (int i = 0; i < directors.length; i++) {
            if (i == idx) {
                if (i == idx) {
                    continue;
                }
                tmp[k] = directors[i];
                k++;
            }
        }

    }

    public Director findByName(String name) {
        for (int i = 0; i < directors.length; i++) {
            if (directors[i].getName().equals(name)) {
                return directors[i];
            }
        }
        return null;
    }

    public void update(Director director) {
        int idx = indexOf(director);
        if (idx != -1) {
            directors[idx].setEmail(director.getEmail());
            directors[idx].setPhone(director.getPhone());
        }
    }
}
