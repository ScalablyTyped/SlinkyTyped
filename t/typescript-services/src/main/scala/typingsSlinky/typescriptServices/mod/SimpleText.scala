package typingsSlinky.typescriptServices.mod

import typingsSlinky.typescriptServices.TypeScript.IScriptSnapshot
import typingsSlinky.typescriptServices.TypeScript.ISimpleText
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleText {
  
  @JSImport("typescript-services", "SimpleText.fromScriptSnapshot")
  @js.native
  def fromScriptSnapshot(scriptSnapshot: IScriptSnapshot): ISimpleText = js.native
  
  @JSImport("typescript-services", "SimpleText.fromString")
  @js.native
  def fromString(value: String): ISimpleText = js.native
}
