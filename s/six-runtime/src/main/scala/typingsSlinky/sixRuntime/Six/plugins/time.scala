package typingsSlinky.sixRuntime.Six.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Six.plugins.time")
@js.native
object time extends js.Object {
  
  @js.native
  trait timmer extends js.Object {
    
    def end(key: String): Double = js.native
    
    def now(): js.Any = js.native
    
    def serialize(): String = js.native
    def serialize(between: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], filter: filter): String = js.native
    def serialize(between: js.UndefOr[scala.Nothing], end: String): String = js.native
    def serialize(between: js.UndefOr[scala.Nothing], end: String, filter: filter): String = js.native
    def serialize(between: String): String = js.native
    def serialize(between: String, end: js.UndefOr[scala.Nothing], filter: filter): String = js.native
    def serialize(between: String, end: String): String = js.native
    def serialize(between: String, end: String, filter: filter): String = js.native
    
    def start(key: String): Unit = js.native
  }
  
  type filter = js.Function1[/* key */ String, Boolean]
}
