package narxoz.kz.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RsourceNotFoundException {
    public RsourceNotFoundException(String message){
        super();
    }
}
