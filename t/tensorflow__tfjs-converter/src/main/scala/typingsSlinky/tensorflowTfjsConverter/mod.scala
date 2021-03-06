package typingsSlinky.tensorflowTfjsConverter

import typingsSlinky.tensorflowTfjsConverter.operationsTypesMod.OpExecutor
import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow/tfjs-converter", "GraphModel")
  @js.native
  class GraphModel protected ()
    extends typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel {
    /**
      * @param modelUrl url for the model, or an `io.IOHandler`.
      * @param weightManifestUrl url for the weight file generated by
      * scripts/convert.py script.
      * @param requestOption options for Request, which allows to send credentials
      * and custom headers.
      * @param onProgress Optional, progress callback function, fired periodically
      * before the load is completed.
      */
    def this(modelUrl: String) = this()
    def this(modelUrl: IOHandler) = this()
    def this(modelUrl: String, loadOptions: LoadOptions) = this()
    def this(modelUrl: IOHandler, loadOptions: LoadOptions) = this()
  }
  
  @JSImport("@tensorflow/tfjs-converter", "deregisterOp")
  @js.native
  def deregisterOp(name: String): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-converter", "loadGraphModel")
  @js.native
  def loadGraphModel(modelUrl: String): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  @JSImport("@tensorflow/tfjs-converter", "loadGraphModel")
  @js.native
  def loadGraphModel(modelUrl: String, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  @JSImport("@tensorflow/tfjs-converter", "loadGraphModel")
  @js.native
  def loadGraphModel(modelUrl: IOHandler): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  @JSImport("@tensorflow/tfjs-converter", "loadGraphModel")
  @js.native
  def loadGraphModel(modelUrl: IOHandler, options: LoadOptions): js.Promise[typingsSlinky.tensorflowTfjsConverter.graphModelMod.GraphModel] = js.native
  
  @JSImport("@tensorflow/tfjs-converter", "registerOp")
  @js.native
  def registerOp(name: String, opFunc: OpExecutor): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-converter", "version_converter")
  @js.native
  val versionConverter: /* "2.7.0" */ String = js.native
}
