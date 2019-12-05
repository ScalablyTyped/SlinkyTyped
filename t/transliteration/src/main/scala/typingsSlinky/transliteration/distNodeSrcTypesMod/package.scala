package typingsSlinky.transliteration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distNodeSrcTypesMod {
  import org.scalablytyped.runtime.StringDictionary

  type IntervalArray = js.Array[js.Tuple2[Double, Double]]
  type OptionReplaceArray = js.Array[OptionReplaceArrayItem]
  type OptionReplaceArrayItem = js.Tuple2[String | js.RegExp, String]
  type OptionReplaceCombined = OptionReplaceArray | OptionReplaceObject
  type OptionReplaceObject = StringDictionary[String]
  type SlugifyFunction = TransliterationFunction[OptionsSlugify]
  type TransliterateFunction = TransliterationFunction[OptionsTransliterate]
}
