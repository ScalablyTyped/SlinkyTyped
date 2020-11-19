package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedArrayBuffer extends js.Object {
  
  /**
    * Read-only. The length of the ArrayBuffer (in bytes).
    */
  val byteLength: Double = js.native
  
  /*
    * The SharedArrayBuffer constructor's length property whose value is 1.
    */
  var length: Double = js.native
  
  /**
    * Returns a section of an SharedArrayBuffer.
    */
  def slice(begin: Double): SharedArrayBuffer = js.native
  def slice(begin: Double, end: Double): SharedArrayBuffer = js.native
  
  @JSName(js.Symbol.species)
  val species: SharedArrayBuffer = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typingsSlinky.std.stdStrings.SharedArrayBuffer = js.native
}
