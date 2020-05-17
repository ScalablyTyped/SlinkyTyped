package typingsSlinky.std.global.WebAssembly

import typingsSlinky.std.BufferSource
import typingsSlinky.std.WebAssembly.Imports
import typingsSlinky.std.WebAssembly.WebAssemblyInstantiatedSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WebAssembly.instantiate")
@js.native
object instantiate extends js.Object {
  def apply(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  def apply(moduleObject: typingsSlinky.std.WebAssembly.Module): js.Promise[typingsSlinky.std.WebAssembly.Instance] = js.native
  def apply(moduleObject: typingsSlinky.std.WebAssembly.Module, importObject: Imports): js.Promise[typingsSlinky.std.WebAssembly.Instance] = js.native
}

