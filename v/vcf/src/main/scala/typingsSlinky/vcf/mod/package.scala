package typingsSlinky.vcf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /** jCard standard format */
  type jCard = js.Tuple2[typingsSlinky.vcf.vcfStrings.vcard, js.Array[typingsSlinky.vcf.mod.jCardProperty]]
  
  type jCardProperty = js.Tuple4[
    java.lang.String, 
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]], 
    java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
