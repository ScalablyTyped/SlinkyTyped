package typingsSlinky.typescriptServices.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "Unicode")
@js.native
class Unicode ()
  extends typingsSlinky.typescriptServices.TypeScript.Unicode
/* static members */
@JSImport("typescript-services", "Unicode")
@js.native
object Unicode extends js.Object {
  
  def isIdentifierPart(code: Double, languageVersion: typingsSlinky.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  def isIdentifierStart(code: Double, languageVersion: typingsSlinky.typescriptServices.TypeScript.LanguageVersion): Boolean = js.native
  
  def lookupInUnicodeMap(code: Double, map: js.Array[Double]): Boolean = js.native
  
  var unicodeES3IdentifierPart: js.Array[Double] = js.native
  
  var unicodeES3IdentifierStart: js.Array[Double] = js.native
  
  var unicodeES5IdentifierPart: js.Array[Double] = js.native
  
  var unicodeES5IdentifierStart: js.Array[Double] = js.native
}
