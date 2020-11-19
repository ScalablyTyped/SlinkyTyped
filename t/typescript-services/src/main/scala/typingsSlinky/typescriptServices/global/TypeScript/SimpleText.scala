package typingsSlinky.typescriptServices.global.TypeScript

import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import typingsSlinky.typescriptServices.TypeScript.ISimpleText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.SimpleText")
@js.native
object SimpleText extends js.Object {
  
  def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): ISimpleText = js.native
  
  def fromString(value: String): ISimpleText = js.native
}
