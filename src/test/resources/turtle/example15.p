fof(axiom,axiom,
   ? [BN_1,BN_2] : (
      triple(BN_1,'http://xmlns.com/foaf/0.1/knows',BN_2)
      & triple(BN_2,'http://xmlns.com/foaf/0.1/name','"Bob"^^http://www.w3.org/2001/XMLSchema#string')
   )
).