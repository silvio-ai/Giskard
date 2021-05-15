package com.asimov.giskard.ui

import com.asimov.giskard.common.Common.getResourceUrl

import javax.imageio.ImageIO

object IPAClickableMap extends ClickableMap(ImageIO.read(getResourceUrl(GiskardUI, "/ipa2.png"))) {

  //nasals
  addRectangle(98, 54, 159, 82, "m", "ma.wav", "ama.wav")           //bilabial
  addRectangle(159, 54, 219, 82, "ɱ", "ɱa.wav", "aɱa.wav")          //labiodental
  addRectangle(219, 54, 377, 82, "n", "na.wav", "ana.wav")          //dental
  addRectangle(377, 54, 438, 82, "ɳ", "ɳa.wav", "aɳa.wav")          //retroflex
  addRectangle(438, 54, 549, 82, "ɲ", "ɲa.wav", "aɲa.wav")          //palatal
  addRectangle(549, 54, 609, 82, "ŋ", "ŋa.wav", "aŋa.wav")          //velar
  addRectangle(609, 54, 668, 82, "ɴ", "ɴa.wav", "aɴa.wav")          //uvular

  //plosives
  addRectangle(98, 82, 128, 110, "p", "pa.wav", "apa.wav")          //bilabial unsounded
  addRectangle(128, 82, 158, 110, "b", "ba.wav", "aba.wav")         //bilabial sounded
  addRectangle(219, 82, 298, 110, "t", "ta.wav", "ata.wav")         //dental unsounded
  addRectangle(298, 82, 377, 110, "d", "da.wav", "ada.wav")         //dental sounded
  addRectangle(377, 82, 407, 110, "ʈ", "ʈa.wav", "aʈa.wav")         //retroflex unsounded
  addRectangle(407, 82, 436, 110, "ɖ", "ɖa.wav", "aɖa.wav")         //retroflex sounded
  addRectangle(436, 82, 492, 110, "c", "ca.wav", "aca.wav")         //palatal unsounded
  addRectangle(492, 82, 548, 110, "ɟ", "ɟa.wav", "aɟa.wav")         //palatal sounded
  addRectangle(548, 82, 578, 110, "k", "ka.wav", "aka.wav")         //velar unsounded
  addRectangle(578, 82, 608, 110, "g", "ga.wav", "aga.wav")         //velar sounded
  addRectangle(608, 82, 638, 110, "q", "qa.wav", "aqa.wav")         //uvular unsounded
  addRectangle(638, 82, 668, 110, "ɢ", "ɢa.wav", "aɢa.wav")         //uvular sounded
  addRectangle(668, 82, 740, 110, "ʡ", "ʡa.wav", "aʡa.wav")         //Pharyngeal
  addRectangle(740, 82, 770, 110, "ʔ", "ʔa.wav", "aʔa.wav")         //Glottal

  //fricatives
  addRectangle(98, 110, 128, 139, "ɸ", "ɸa.wav", "aɸa.wav")         //bilabial unsounded
  addRectangle(128, 110, 158, 139, "β", "βa.wav", "aβa.wav")	      //bilabial sounded
  addRectangle(158, 110, 188, 139, "f", "fa.wav", "afa.wav")	      //labiodental unsounded
  addRectangle(188, 110, 219, 139, "v", "va.wav", "ava.wav")	      //labiodental sounded
  addRectangle(219, 110, 245, 139, "θ", "θa.wav", "aθa.wav")	      //dental unsounded
  addRectangle(245, 110, 272, 139, "ð", "ða.wav", "aða.wav")	      //dental sounded
  addRectangle(272, 110, 297, 139, "s", "sa.wav", "asa.wav")	      //alveolar unsounded
  addRectangle(297, 110, 324, 139, "z", "za.wav", "aza.wav")	      //alveolar sounded
  addRectangle(324, 110, 349, 139, "ʃ", "ʃa.wav", "aʃa.wav")	      //palatoalveolar unsounded
  addRectangle(349, 110, 378, 139, "ʒ", "ʒa.wav", "aʒa.wav")	      //palatoalveolar sounded
  addRectangle(377, 110, 407, 139, "ʂ", "ʂa.wav", "aʂa.wav")	      //retroflex unsounded
  addRectangle(407, 110, 436, 139, "ʐ", "ʐa.wav", "aʐa.wav")	      //retroflex sounded
  addRectangle(436, 110, 465, 139, "ɕ", "ɕa.wav", "aɕa.wav")	      //alveolopalatal unsounded
  addRectangle(465, 110, 493, 139, "ʑ", "ʑa.wav", "aʑa.wav")	      //alveolopalatal sounded
  addRectangle(493, 110, 520, 139, "ç", "ça.wav", "aça.wav")	      //palatal unsounded
  addRectangle(520, 110, 548, 139, "ʝ", "ʝa.wav", "aʝa.wav")	      //palatal sounded
  addRectangle(548, 110, 578, 139, "x", "xa.wav", "axa.wav")	      //velar unsounded
  addRectangle(578, 110, 608, 139, "ɣ", "ɣa.wav", "aɣa.wav")	      //velar sounded
  addRectangle(608, 110, 638, 139, "χ", "χa.wav", "aχa.wav")	      //uvular unsounded
  addRectangle(638, 110, 668, 168, "ʁ", "ʁa.wav", "aʁa.wav")	      //uvular sounded fricative/approximant
  addRectangle(668, 110, 705, 139, "ħ", "ħa.wav", "aħa.wav")	      //Pharyngeal
  addRectangle(705, 110, 740, 168, "ʕ", "ʕa.wav", "aʕa.wav")	      //Glottal fricative/approximant
  addRectangle(740, 110, 771, 168, "h", "ha.wav", "aha.wav")	      //Pharyngeal
  addRectangle(771, 110, 800, 168, "ɦ", "ɦa.wav", "aɦa.wav")	      //Glottal fricative/approximant

  //approximants
  addRectangle(157, 139, 219, 168, "ʋ", "ʋa.wav", "aʋa.wav")	      //labiodental sounded
  addRectangle(219, 139, 377, 168, "ɹ", "ɹa.wav", "aɹa.wav")	      //dental
  addRectangle(377, 139, 436, 168, "ɻ", "ɻa.wav", "aɻa.wav")	      //retroflex sounded
  addRectangle(438, 139, 549, 168, "j", "ja.wav", "aja.wav")	      //palatal
  addRectangle(549, 139, 609, 168, "ɰ", "ɰa.wav", "aɰa.wav")	      //velar

  //taps/flaps
  addRectangle(157, 168, 219, 198, "ⱱ", "ʋa.wav", "aʋa.wav")	      //labiodental sounded
  addRectangle(219, 168, 377, 198, "ɾ", "ɾa.wav", "aɾa.wav")	      //dental
  addRectangle(377, 168, 436, 198, "ɽ", "ɽa.wav", "aɽa.wav")	      //retroflex sounded

  //trills
  addRectangle(98, 198, 158, 226, "ʙ", "ʙa.wav", "aʙa.wav")	        //bilabial sounded
  addRectangle(219, 198, 377, 226, "r", "ra.wav", "ara.wav")	      //dental
  addRectangle(609, 198, 668, 226, "ʀ", "ʀa.wav", "aʀa.wav")	      //uvular
  addRectangle(668, 198, 705, 226, "ʜ", "ʜa.wav", "aʜa.wav")	      //Pharyngeal
  addRectangle(705, 198, 740, 226, "ʢ", "ʢa.wav", "aʢa.wav")	      //Glottal fricative/approximant

  //lateral fricatives
  addRectangle(219, 226, 298, 256, "ɬ", "ɬa.wav", "aɬa.wav")	      //dental unsounded
  addRectangle(298, 226, 377, 256, "ɮ", "ɮa.wav", "aɮa.wav")	      //dental sounded

  //lateral approximants
  addRectangle(219, 256, 377, 284, "l", "la.wav", "ala.wav")	      //dental
  addRectangle(377, 256, 436, 284, "ɭ", "ɭa.wav", "aɭa.wav")	      //retroflex sounded
  addRectangle(438, 256, 548, 284, "ʎ", "ʎa.wav", "aʎa.wav")	      //palatal sounded
  addRectangle(549, 256, 608, 284, "ʟ", "ʟa.wav", "aʟa.wav")	      //velar sounded

  //lateral flaps
  //		addRectangle(219, 284, 377, 314, "ɺ", "ɺa.wav", "aɺa.wav");	//dental

  //vowels
  addRectangle(528, 306, 543, 329, "i", "i.wav")	                  //close front unrounded
  addRectangle(551, 306, 568, 329, "y", "y.wav")	                  //close front rounded
  addRectangle(642, 306, 656, 329, "ɨ", "ɨ.wav")	                  //close central unrounded
  addRectangle(664, 306, 683, 329, "ʉ", "ʉ.wav")	                  //close central rounded
  addRectangle(746, 306, 769, 329, "ɯ", "ɯ.wav")	                  //close back unrounded
  addRectangle(777, 306, 794, 329, "u", "u.wav")	                  //close back rounded
  addRectangle(580, 337, 594, 353, "ɪ", "ɪ.wav")	                  //lax-close front unrounded
  addRectangle(595, 337, 613, 353, "ʏ", "ʏ.wav")	                  //lax-close front rounded
  addRectangle(724, 337, 743, 353, "ʊ", "ʊ.wav")	                  //lax-close back rounded
  addRectangle(564, 366, 580, 383, "e", "e.wav")	                  //close-mid front unrounded
  addRectangle(589, 366, 608, 383, "ø", "ø.wav")	                  //close-mid front rounded
  addRectangle(658, 366, 676, 383, "ɘ", "ɘ.wav")	                  //close-mid central unrounded (close-mid schwa)
  addRectangle(684, 366, 702, 383, "ɵ", "ɵ.wav")	                  //close-mid central rounded (rounded schwa)
  addRectangle(751, 366, 766, 383, "ɤ", "ɤ.wav")	                  //close-mid back unrounded
  addRectangle(778, 366, 794, 383, "o", "o.wav")	                  //close-mid back rounded
  addRectangle(676, 392, 698, 412, "ə", "ə.wav")	                  //schwa
  addRectangle(602, 422, 618, 440, "ɛ", "ɛ.wav")	                  //open-mid front unrounded
  addRectangle(628, 422, 650, 440, "œ", "œ.wav")	                  //open-mid front rounded
  addRectangle(678, 422, 692, 440, "ɜ", "ɜ.wav")	                  //open-mid central unrounded
  addRectangle(702, 422, 720, 440, "ɞ", "ɞ.wav")	                  //open-mid central rounded
  addRectangle(753, 422, 769, 440, "ʌ", "ʌ.wav")	                  //open-mid back unrounded
  addRectangle(777, 422, 794, 440, "ɔ", "ɔ.wav")	                  //open-mid back rounded
  addRectangle(618, 455, 640, 472, "æ", "æ.wav")	                  //raised-open front unrounded
  addRectangle(698, 450, 718, 468, "ɐ", "ɐ.wav")	                  //raised open central (open-mid schwa)
  addRectangle(642, 482, 658, 498, "a", "a.wav")	                  //open front unrounded
  addRectangle(666, 482, 688, 498, "ɶ", "ɶ.wav")	                  //open front rounded
  addRectangle(753, 482, 769, 498, "ɑ", "ɑ.wav")	                  //open back unrounded
  addRectangle(777, 482, 794, 498, "ɒ", "ɒ.wav")	                  //open back rounded

  //affricates
  addRectangle(5, 318, 27, 348, "p͡f", "p͡fa.wav", "ap͡fa.wav");	  //p͡f
  addRectangle(32, 318, 52, 348, "t͡s", "t͡sa.wav", "at͡sa.wav"); 	//t͡s
  addRectangle(62, 318, 86, 348, "d͡z", "d͡za.wav", "ad͡za.wav"); 	//d͡z
  addRectangle(92, 318, 114, 348, "t͡ɬ", "t͡ɬa.wav", "at͡ɬa.wav");	//t͡ɬ
  addRectangle(118, 318, 146, 348, "d͡ɮ", "d͡ɮa.wav", "ad͡ɮa.wav"); //d͡ɮ
  addRectangle(152, 318, 170, 348, "t͡ʃ", "t͡ʃa.wav", "at͡ʃa.wav"); //t͡ʃ
  addRectangle(178, 318, 202, 348, "d͡ʒ", "d͡ʒa.wav", "ad͡ʒa.wav"); //d͡ʒ
  addRectangle(210, 318, 232, 348, "t͡ɕ", "t͡ɕa.wav", "at͡ɕa.wav"); //t͡ɕ
  addRectangle(242, 318, 264, 348, "d͡ʑ", "d͡ʑa.wav", "ad͡ʑa.wav"); //d͡ʑ
  addRectangle(272, 318, 292, 348, "t͡ʂ", "t͡ʂa.wav", "at͡ʂa.wav"); //t͡ʂ
  addRectangle(304, 318, 328, 348, "d͡ʐ", "d͡ʐa.wav", "ad͡ʐa.wav"); //d͡ʐ
  addRectangle(340, 318, 364, 348, "k͡x", "k͡xa.wav", "ak͡xa.wav"); //k͡x

  //diacritics
  addRectangle(5, 373, 25, 402, "\u0303")                           //nasalized ẽ
  addRectangle(25, 373, 44, 402, "\u0320")                          //retracted e̠
  addRectangle(44, 373, 63, 402, "\u0308")                          //centralized ë
  addRectangle(63, 373, 82, 402, "\u033D")                          //mid-centralized e̽
  addRectangle(82, 373, 101, 402, "\u032F")                         //non syllabic e̯
  addRectangle(101, 373, 120, 402, "\u031D")                        //raised e̝
  addRectangle(120, 373, 139, 402, "\u031E")                        //lowered e̞
  addRectangle(139, 373, 158, 402, "\u0318")                        //advanced tongue root e̘
  addRectangle(158, 373, 177, 402, "\u0319")                        //retracted tongue root e̙
  addRectangle(177, 373, 196, 402, "\u02DE")                        //rhoticity ə˞
  addRectangle(199, 373, 217, 402, "\u0339")                        //more rounded ɔ̹
  addRectangle(217, 373, 235, 402, "\u031C")                        //less rounded ɔ̜
  addRectangle(235, 373, 255, 402, "\u031F")                        //advanced u̟
  addRectangle(255, 373, 272, 402, "\u0334")                        //velarized l̴
  addRectangle(273, 373, 293, 402, "\u0329")                        //syllabic n̩
  addRectangle(293, 373, 318, 402, "\u0361")                        //over tie bar x͡x
  addRectangle(320, 373, 343, 402, "\u035C")                        //under tie bar x͜x
  addRectangle(342, 373, 365, 402, "\u02C8")                        //primary stress ˈb
  addRectangle(366, 373, 388, 402, "\u02CC")                        //secondary stress ˌb

  addRectangle(6, 408, 21, 437, "\u033C")                           //linguolabial t̼
  addRectangle(21, 408, 36, 437, "\u032A")                          //dental t̪
  addRectangle(36, 408, 49, 437, "\u033A")                          //apical t̺
  addRectangle(49, 408, 64, 437, "\u033B")                          //laminal t̻
  addRectangle(64, 408, 79, 437, "\u032C")                          //voiced t̬
  addRectangle(81, 408, 105, 437, "\u02B0")                         //aspirated tʰ
  addRectangle(105, 408, 129, 437, "\u02B7")                        //labialized tʷ
  addRectangle(129, 408, 149, 437, "\u02B2")                        //palatalized tʲ
  addRectangle(149, 408, 173, 437, "\u02E0")                        //velarized tˠ
  addRectangle(173, 408, 193, 437, "\u02E4")                        //pharyngealized tˤ
  addRectangle(193, 408, 221, 437, "ⁿ")                             //nasal release dⁿ
  addRectangle(221, 408, 246, 437, "ˡ")                             //lateral release dˡ
  addRectangle(246, 408, 272, 437, "\u031A")                        //no audible release t̚
  addRectangle(272, 408, 290, 437, "\u0325")                        //voiceless d̥
  addRectangle(290, 408, 309, 437, "\u0324")                        //breathy voiced b̤
  addRectangle(309, 408, 327, 437, "\u0330")                        //creaky voiced b̰
  addRectangle(327, 408, 348, 437, "\u02D0")                        //gemination ː
  addRectangle(350, 408, 371, 437, "\u02D1")                        //half length ˑ

  //other
  addRectangle(8, 465, 32, 490, "ʍ")                                //voiceless labial-velar fricative ʍ
  addRectangle(32, 465, 55, 490, "w")                               //voiced labial-velar fricative w
  addRectangle(55, 465, 73, 490, "ɥ")                               //voiced labial-palatal approximant ɥ
  addRectangle(73, 465, 95, 490, "ʜ")                               //voiced epiglottal fricative ʜ
  addRectangle(95, 467, 110, 493, "ɺ")                              //voiced alveolar lateral flap ɺ
  addRectangle(110, 465, 129, 495, "ɧ")                             // simultaneous ʃ and x -> ɧ
  addRectangle(133, 470, 176, 490, "{SIL}")                         // silence

}
