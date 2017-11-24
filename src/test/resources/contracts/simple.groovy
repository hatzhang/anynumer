
import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method "GET"
        url  value(regex('/simple/[a-z]*'))
    }
    response { // (6)
        status 200 // (7)
        body(
                number: anyNumber()
        )
        headers { // (9)
            contentType('application/json')
        }
    }
}

