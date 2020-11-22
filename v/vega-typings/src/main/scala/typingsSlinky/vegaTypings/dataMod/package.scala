package typingsSlinky.vegaTypings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dataMod {
  
  type Datum = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaTypings.dataMod.FormatJSON
    - typingsSlinky.vegaTypings.dataMod.FormatSV
    - typingsSlinky.vegaTypings.dataMod.FormatDSV
    - typingsSlinky.vegaTypings.dataMod.FormatTopoJSON
    - typingsSlinky.vegaTypings.anon.Parse
  */
  type Format = typingsSlinky.vegaTypings.dataMod._Format | typingsSlinky.vegaTypings.dataMod.FormatTopoJSON
  
  type FormatTopoJSON = typingsSlinky.vegaTypings.anon.Property with (typingsSlinky.vegaTypings.anon.Feature | typingsSlinky.vegaTypings.anon.Filter)
  
  type Parse = typingsSlinky.vegaTypings.vegaTypingsStrings.auto | (org.scalablytyped.runtime.StringDictionary[typingsSlinky.vegaTypings.dataMod.DataType | java.lang.String])
  
  type URI = java.lang.String
}
