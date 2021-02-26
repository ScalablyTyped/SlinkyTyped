package typingsSlinky.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IndentStyle extends StObject
@JSImport("typescript", "IndentStyle")
@js.native
object IndentStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IndentStyle with Double] = js.native
  
  @js.native
  sealed trait Block extends IndentStyle
  /* 1 */ val Block: typingsSlinky.typescript.mod.IndentStyle.Block with Double = js.native
  
  @js.native
  sealed trait None extends IndentStyle
  /* 0 */ val None: typingsSlinky.typescript.mod.IndentStyle.None with Double = js.native
  
  @js.native
  sealed trait Smart extends IndentStyle
  /* 2 */ val Smart: typingsSlinky.typescript.mod.IndentStyle.Smart with Double = js.native
}
