package typingsSlinky.xstate

import typingsSlinky.xstate.anon.Src
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.InvokeConfig
import typingsSlinky.xstate.typesMod.InvokeDefinition
import typingsSlinky.xstate.typesMod.InvokeSourceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeUtilsMod {
  
  @JSImport("xstate/lib/invokeUtils", "toInvokeDefinition")
  @js.native
  def toInvokeDefinition[TContext, TEvent /* <: EventObject */](invokeConfig: (InvokeConfig[TContext, TEvent]) with Src): InvokeDefinition[TContext, TEvent] = js.native
  
  @JSImport("xstate/lib/invokeUtils", "toInvokeSource")
  @js.native
  def toInvokeSource(src: String): InvokeSourceDefinition = js.native
  @JSImport("xstate/lib/invokeUtils", "toInvokeSource")
  @js.native
  def toInvokeSource(src: InvokeSourceDefinition): InvokeSourceDefinition = js.native
}
