package typingsSlinky.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
class EnclosingTypeWalkerState ()
  extends typingsSlinky.typescriptServices.TypeScript.EnclosingTypeWalkerState {
  /* CompleteClass */
  override var _currentSymbols: js.Array[typingsSlinky.typescriptServices.TypeScript.PullSymbol] = js.native
  /* CompleteClass */
  override var _hasSetEnclosingType: Boolean = js.native
}

/* static members */
@JSGlobal("TypeScript.EnclosingTypeWalkerState")
@js.native
object EnclosingTypeWalkerState extends js.Object {
  def getDefaultEnclosingTypeWalkerState(): typingsSlinky.typescriptServices.TypeScript.EnclosingTypeWalkerState = js.native
  def getGenericEnclosingTypeWalkerState(genericEnclosingType: typingsSlinky.typescriptServices.TypeScript.PullTypeSymbol): typingsSlinky.typescriptServices.TypeScript.EnclosingTypeWalkerState = js.native
  def getNonGenericEnclosingTypeWalkerState(): typingsSlinky.typescriptServices.TypeScript.EnclosingTypeWalkerState = js.native
}

