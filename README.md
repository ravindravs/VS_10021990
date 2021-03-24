# VS_10021990

This is a Spring boot project which has only back code.
Masking of the card number and sort the data based on  expiry date by descending.

Post:
http://localhost:9000/card
Request:
 {
        "id":1,
        "cardNumber": "8765432187654321",
        "bankName": "State Bank of India",
        "expiryDate": "Dec 21"
}
Response:
{
        "id": 1,
        "cardNumber": "8765-xxxx-xxxx-xxxx",
        "bankName": "State Bank of India",
        "expiryDate": "Dec 21"
    },
    
--------------------------------------------------------
  Get list of card in descending order based Expiry date:

Request: http://localhost:9000/card

Response:
  [
    {
        "id": 2,
        "cardNumber": "8765-xxxx-xxxx-xxxx",
        "bankName": "State Bank of India",
        "expiryDate": "Dec 21"
    },
    {
        "id": 1,
        "cardNumber": "1234-xxxx-xxxx-xxxx",
        "bankName": "Bank of Baroda",
        "expiryDate": "Nov 21"
    }
]
