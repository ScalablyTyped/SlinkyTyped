package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "transform")
@js.native
object transform extends js.Object {
  
  /**
    * Transform one or more nodes using the supplied transformers.
    * @param source A single `Node` or an array of `Node` objects.
    * @param transformers An array of `TransformerFactory` callbacks used to process the transformation.
    * @param compilerOptions Optional compiler options.
    */
  def apply[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = js.native
  def apply[T /* <: Node */](source: T, transformers: js.Array[TransformerFactory[T]], compilerOptions: CompilerOptions): TransformationResult[T] = js.native
  def apply[T /* <: Node */](source: js.Array[T], transformers: js.Array[TransformerFactory[T]]): TransformationResult[T] = js.native
  def apply[T /* <: Node */](
    source: js.Array[T],
    transformers: js.Array[TransformerFactory[T]],
    compilerOptions: CompilerOptions
  ): TransformationResult[T] = js.native
}
