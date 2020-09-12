#!/bin/sh

curl -H "Content-Type: application/json" --data-binary '{"max":99}' 'http://localhost:8080/api/random-number'
echo
