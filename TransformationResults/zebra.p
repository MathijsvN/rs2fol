fof(axiom,axiom,(! [L,A1,A2,A3,A4,A5,A6,A7,A8,A9,A10,A11,A12,A13,A14,A15,A16,A17,A18,A19,A20,A21,A22,A23,A24,A25,A26,A27,A28,A29,A30,A31,A32,A33,A34,A35,A36,A37,A38,A39,A40,A41,A42,A43,A44,A45,A46,A47,A48,A49,A50,A51,A52,A53,A54,A55,A56,A57,A58,A59,A60,A61,A62,A63,A64,A65,A66] : ~(triple(L,'http://www.w3.org/2000/10/swap/log#equalTo',list5(list5(A1,'http://example.org/ns#Norwegian',A2,A3,A4),list5('http://example.org/ns#blue',A5,A6,A7,A8),list5(A9,A10,A11,'http://example.org/ns#milk',A12),A13,A14)) & triple(L,'http://example.org/ns#pair',list2(list5(A15,A16,A17,A18,'http://example.org/ns#Kools'),list5(A19,A20,'http://example.org/ns#horse',A21,A22))) & triple(L,'http://example.org/ns#pair',list2(list5(A23,A24,'http://example.org/ns#fox',A25,A26),list5(A27,A28,A29,A30,'http://example.org/ns#Chesterfields'))) & triple(L,'http://example.org/ns#sublist',list2(list5('http://example.org/ns#ivory',A31,A32,A33,A34),list5('http://example.org/ns#green',A35,A36,'http://example.org/ns#coffee',A37))) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5('http://example.org/ns#red','http://example.org/ns#Englishman',A38,A39,A40)) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A41,'http://example.org/ns#Spaniard','http://example.org/ns#dog',A42,A43)) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A44,'http://example.org/ns#Ukrainian',A45,'http://example.org/ns#tea',A46)) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A47,A48,'http://example.org/ns#snails',A49,'http://example.org/ns#Old_Gold')) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5('http://example.org/ns#yellow',A50,A51,A52,'http://example.org/ns#Kools')) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A53,A54,A55,'http://example.org/ns#orange_juice','http://example.org/ns#Lucky_Strike')) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A56,'http://example.org/ns#Japanese',A57,A58,'http://example.org/ns#Parliaments')) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A59,A60,A61,'http://example.org/ns#water',A62)) & triple(L,'http://www.w3.org/2000/10/swap/list#member',list5(A63,A64,'http://example.org/ns#zebra',A65,A66)) & ~(triple(A60,'http://example.org/ns#drinks','http://example.org/ns#water') & triple(A64,'http://example.org/ns#owns','http://example.org/ns#zebra') & triple('http://example.org/ns#riddle','http://example.org/ns#houses',L))) & ! [A,B,C] : ~(~(triple(A,'http://example.org/ns#pair',list2(B,C))) & triple(A,'http://example.org/ns#sublist',list2(B,C))) & ! [A,B,C] : ~(~(triple(A,'http://example.org/ns#pair',list2(B,C))) & triple(A,'http://example.org/ns#sublist',list2(C,B))) & ! [A,B,C,D,E] : ~(~(triple(A,'http://example.org/ns#sublist',B)) & triple(list2(C,D),'http://www.w3.org/2000/10/swap/list#append',A) & triple(list2(E,B),'http://www.w3.org/2000/10/swap/list#append',C)))).
fof(conjecture,conjecture,(triple('http://example.org/ns#Norwegian','http://example.org/ns#drinks','http://example.org/ns#water') & triple('http://example.org/ns#Japanese','http://example.org/ns#owns','http://example.org/ns#zebra') & triple('http://example.org/ns#riddle','http://example.org/ns#houses',list5(list5('http://example.org/ns#yellow','http://example.org/ns#Norwegian','http://example.org/ns#fox','http://example.org/ns#water','http://example.org/ns#Kools'),list5('http://example.org/ns#blue','http://example.org/ns#Ukrainian','http://example.org/ns#horse','http://example.org/ns#tea','http://example.org/ns#Chesterfields'),list5('http://example.org/ns#red','http://example.org/ns#Englishman','http://example.org/ns#snails','http://example.org/ns#milk','http://example.org/ns#Old_Gold'),list5('http://example.org/ns#ivory','http://example.org/ns#Spaniard','http://example.org/ns#dog','http://example.org/ns#orange_juice','http://example.org/ns#Lucky_Strike'),list5('http://example.org/ns#green','http://example.org/ns#Japanese','http://example.org/ns#zebra','http://example.org/ns#coffee','http://example.org/ns#Parliaments'))))).