package com.ahmed.parks.data;



import com.ahmed.parks.model.Park;

import java.util.List;

public interface AsyncResponse {
    void processPark(List<Park> parks);
}
