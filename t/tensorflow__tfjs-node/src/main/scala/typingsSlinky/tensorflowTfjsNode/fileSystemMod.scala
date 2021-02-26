package typingsSlinky.tensorflowTfjsNode

import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsCore.typesMod.SaveResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fileSystemMod {
  
  @JSImport("@tensorflow/tfjs-node/dist/io/file_system", "NodeFileSystem")
  @js.native
  class NodeFileSystem protected () extends IOHandler {
    /**
      * Constructor of the NodeFileSystem IOHandler.
      * @param path A single path or an Array of paths.
      *   For saving: expects a single path pointing to an existing or nonexistent
      *     directory. If the directory does not exist, it will be
      *     created.
      *   For loading:
      *     - If the model has JSON topology (e.g., `tf.Model`), a single path
      *       pointing to the JSON file (usually named `model.json`) is expected.
      *       The JSON file is expected to contain `modelTopology` and/or
      *       `weightsManifest`. If `weightManifest` exists, the values of the
      *       weights will be loaded from relative paths (relative to the directory
      *       of `model.json`) as contained in `weightManifest`.
      *     - If the model has binary (protocol buffer GraphDef) topology,
      *       an Array of two paths is expected: the first path should point to the
      *       .pb file and the second path should point to the weight manifest
      *       JSON file.
      */
    def this(path: String) = this()
    def this(path: js.Array[String]) = this()
    
    val MODEL_BINARY_FILENAME: /* "tensorflowjs.pb" */ String = js.native
    
    val MODEL_JSON_FILENAME: /* "model.json" */ String = js.native
    
    val WEIGHTS_BINARY_FILENAME: /* "weights.bin" */ String = js.native
    
    /**
      * For each item in `this.path`, creates a directory at the path or verify
      * that the path exists as a directory.
      */
    /* protected */ def createOrVerifyDirectory(): js.Promise[Unit] = js.native
    
    /* protected */ def loadBinaryModel(): js.Promise[ModelArtifacts] = js.native
    
    /* protected */ def loadJSONModel(): js.Promise[ModelArtifacts] = js.native
    
    var loadWeights: js.Any = js.native
    
    @JSName("load")
    def load_MNodeFileSystem(): js.Promise[ModelArtifacts] = js.native
    
    val path: String | js.Array[String] = js.native
    
    @JSName("save")
    def save_MNodeFileSystem(modelArtifacts: ModelArtifacts): js.Promise[SaveResult] = js.native
  }
  /* static members */
  object NodeFileSystem {
    
    @JSImport("@tensorflow/tfjs-node/dist/io/file_system", "NodeFileSystem.URL_SCHEME")
    @js.native
    val URL_SCHEME: /* "file://" */ String = js.native
  }
  
  @JSImport("@tensorflow/tfjs-node/dist/io/file_system", "fileSystem")
  @js.native
  def fileSystem(path: String): NodeFileSystem = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/file_system", "fileSystem")
  @js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  
  @JSImport("@tensorflow/tfjs-node/dist/io/file_system", "nodeFileSystemRouter")
  @js.native
  def nodeFileSystemRouter(url: String): NodeFileSystem = js.native
  @JSImport("@tensorflow/tfjs-node/dist/io/file_system", "nodeFileSystemRouter")
  @js.native
  def nodeFileSystemRouter(url: js.Array[String]): NodeFileSystem = js.native
}
