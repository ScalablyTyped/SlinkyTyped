package typingsSlinky.three

import org.scalajs.dom.raw.ErrorEvent
import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.three.bufferGeometryMod.BufferGeometry
import typingsSlinky.three.instancedBufferGeometryMod.InstancedBufferGeometry
import typingsSlinky.three.loaderMod.Loader
import typingsSlinky.three.loadingManagerMod.LoadingManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/BufferGeometryLoader", JSImport.Namespace)
@js.native
object bufferGeometryLoaderMod extends js.Object {
  @js.native
  class BufferGeometryLoader () extends Loader {
    def this(manager: LoadingManager) = this()
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.UndefOr[scala.Nothing],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit]
    ): Unit = js.native
    def load(
      url: String,
      onLoad: js.Function1[/* bufferGeometry */ InstancedBufferGeometry | BufferGeometry, Unit],
      onProgress: js.Function1[/* request */ ProgressEvent, Unit],
      onError: js.Function1[/* event */ ErrorEvent, Unit]
    ): Unit = js.native
    def parse(json: js.Any): InstancedBufferGeometry | BufferGeometry = js.native
  }
  
}

