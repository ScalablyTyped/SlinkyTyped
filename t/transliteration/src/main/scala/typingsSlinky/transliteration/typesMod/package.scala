package typingsSlinky.transliteration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type IntervalArray = js.Array[js.Tuple2[scala.Double, scala.Double]]
  type OptionReplaceArray = js.Array[typingsSlinky.transliteration.typesMod.OptionReplaceArrayItem]
  type OptionReplaceArrayItem = js.Tuple2[java.lang.String | js.RegExp, java.lang.String]
  type OptionReplaceObject = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type SlugifyFunction = typingsSlinky.transliteration.typesMod.TransliterationFunction[typingsSlinky.transliteration.typesMod.OptionsSlugify]
  type TransliterateFunction = typingsSlinky.transliteration.typesMod.TransliterationFunction[typingsSlinky.transliteration.typesMod.OptionsTransliterate]
}
