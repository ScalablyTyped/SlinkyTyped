package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dataMod {
  type Datum = js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.dataMod.FormatJSON
    - typingsSlinky.vegaTypings.dataMod.FormatSV
    - typingsSlinky.vegaTypings.dataMod.FormatDSV
    - typingsSlinky.vegaTypings.dataMod.FormatTopoJSON
    - typingsSlinky.vegaTypings.AnonParse
  */
  type Format = typingsSlinky.vegaTypings.dataMod._Format | typingsSlinky.vegaTypings.dataMod.FormatTopoJSON
  type FormatTopoJSON = typingsSlinky.vegaTypings.AnonProperty with (typingsSlinky.vegaTypings.AnonFeature | typingsSlinky.vegaTypings.AnonFilter)
  type Parse = typingsSlinky.vegaTypings.vegaTypingsStrings.auto | (org.scalablytyped.runtime.StringDictionary[typingsSlinky.vegaTypings.dataMod.DataType | java.lang.String])
}
