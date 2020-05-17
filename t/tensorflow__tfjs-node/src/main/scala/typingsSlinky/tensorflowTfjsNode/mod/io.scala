package typingsSlinky.tensorflowTfjsNode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.raw.File
import typingsSlinky.tensorflowTfjsCore.anon.Data
import typingsSlinky.tensorflowTfjsCore.routerRegistryMod.IORouter
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import typingsSlinky.tensorflowTfjsCore.typesMod.IOHandler
import typingsSlinky.tensorflowTfjsCore.typesMod.LoadOptions
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifacts
import typingsSlinky.tensorflowTfjsCore.typesMod.ModelArtifactsInfo
import typingsSlinky.tensorflowTfjsCore.typesMod.SaveResult
import typingsSlinky.tensorflowTfjsCore.typesMod.TrainingConfig
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightGroup
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestConfig
import typingsSlinky.tensorflowTfjsCore.typesMod.WeightsManifestEntry
import typingsSlinky.tensorflowTfjsNode.anon.FnCall
import typingsSlinky.tensorflowTfjsNode.anon.FnCallManifestFilePathPrefixWeightNamesRequestInit
import typingsSlinky.tensorflowTfjsNode.anon.FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig
import typingsSlinky.tensorflowTfjsNode.anon.FnCallTensorsGroup
import typingsSlinky.tensorflowTfjsNode.fileSystemMod.NodeFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "io")
@js.native
object io extends js.Object {
  @JSName("browserFiles")
  var browserFiles_Original: js.Function1[/* files */ js.Array[File], IOHandler] = js.native
  @JSName("browserHTTPRequest")
  var browserHTTPRequest_Original: FnCall = js.native
  @JSName("concatenateArrayBuffers")
  var concatenateArrayBuffers_Original: js.Function1[/* buffers */ js.Array[js.typedarray.ArrayBuffer], js.typedarray.ArrayBuffer] = js.native
  @JSName("copyModel")
  var copyModel_Original: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSName("decodeWeights")
  var decodeWeights_Original: js.Function2[
    /* buffer */ js.typedarray.ArrayBuffer, 
    /* specs */ js.Array[WeightsManifestEntry], 
    NamedTensorMap
  ] = js.native
  @JSName("encodeWeights")
  var encodeWeights_Original: FnCallTensorsGroup = js.native
  @JSName("fileSystem")
  var fileSystem_Original: js.Function1[/* path */ String | js.Array[String], NodeFileSystem] = js.native
  @JSName("fromMemory")
  var fromMemory_Original: FnCallModelArtifactsWeightSpecsWeightDataTrainingConfig = js.native
  @JSName("getModelArtifactsInfoForJSON")
  var getModelArtifactsInfoForJSON_Original: js.Function1[/* modelArtifacts */ ModelArtifacts, ModelArtifactsInfo] = js.native
  @JSName("http")
  var http_Original: FnCall = js.native
  @JSName("isHTTPScheme")
  var isHTTPScheme_Original: js.Function1[/* url */ String, Boolean] = js.native
  @JSName("listModels")
  var listModels_Original: js.Function0[js.Promise[StringDictionary[ModelArtifactsInfo]]] = js.native
  @JSName("loadWeights")
  var loadWeights_Original: FnCallManifestFilePathPrefixWeightNamesRequestInit = js.native
  @JSName("moveModel")
  var moveModel_Original: js.Function2[/* sourceURL */ String, /* destURL */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSName("nodeHTTPRequest")
  var nodeHTTPRequest_Original: js.Function3[
    /* path */ String, 
    /* requestInit */ js.UndefOr[RequestInit], 
    /* weightPathPrefix */ js.UndefOr[String], 
    IOHandler
  ] = js.native
  @JSName("removeModel")
  var removeModel_Original: js.Function1[/* url */ String, js.Promise[ModelArtifactsInfo]] = js.native
  @JSName("weightsLoaderFactory")
  var weightsLoaderFactory_Original: js.Function1[
    /* fetchWeightsFunction */ js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[js.typedarray.ArrayBuffer]]], 
    js.Function3[
      /* manifest */ WeightsManifestConfig, 
      /* filePathPrefix */ js.UndefOr[String], 
      /* weightNames */ js.UndefOr[js.Array[String]], 
      js.Promise[NamedTensorMap]
    ]
  ] = js.native
  @JSName("withSaveHandler")
  var withSaveHandler_Original: js.Function1[
    /* saveHandler */ js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]], 
    IOHandler
  ] = js.native
  def browserFiles(files: js.Array[File]): IOHandler = js.native
  def browserHTTPRequest(path: String): IOHandler = js.native
  def browserHTTPRequest(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def concatenateArrayBuffers(buffers: js.Array[js.typedarray.ArrayBuffer]): js.typedarray.ArrayBuffer = js.native
  def copyModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  def decodeWeights(buffer: js.typedarray.ArrayBuffer, specs: js.Array[WeightsManifestEntry]): NamedTensorMap = js.native
  def encodeWeights(tensors: js.Array[NamedTensor]): js.Promise[Data] = js.native
  def encodeWeights(tensors: js.Array[NamedTensor], group: WeightGroup): js.Promise[Data] = js.native
  def encodeWeights(tensors: NamedTensorMap): js.Promise[Data] = js.native
  def encodeWeights(tensors: NamedTensorMap, group: WeightGroup): js.Promise[Data] = js.native
  def fileSystem(path: String): NodeFileSystem = js.native
  def fileSystem(path: js.Array[String]): NodeFileSystem = js.native
  def fromMemory(modelArtifacts: js.Object): IOHandler = js.native
  def fromMemory(modelArtifacts: js.Object, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: js.Object,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts): IOHandler = js.native
  def fromMemory(modelArtifacts: ModelArtifacts, weightSpecs: js.Array[WeightsManifestEntry]): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer
  ): IOHandler = js.native
  def fromMemory(
    modelArtifacts: ModelArtifacts,
    weightSpecs: js.Array[WeightsManifestEntry],
    weightData: js.typedarray.ArrayBuffer,
    trainingConfig: TrainingConfig
  ): IOHandler = js.native
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: String, onProgress: js.Function): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String], onProgress: js.Function): js.Array[IOHandler] = js.native
  def getModelArtifactsInfoForJSON(modelArtifacts: ModelArtifacts): ModelArtifactsInfo = js.native
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def http(path: String): IOHandler = js.native
  def http(path: String, loadOptions: LoadOptions): IOHandler = js.native
  def isHTTPScheme(url: String): Boolean = js.native
  def listModels(): js.Promise[StringDictionary[ModelArtifactsInfo]] = js.native
  def loadWeights(manifest: WeightsManifestConfig): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String): js.Promise[NamedTensorMap] = js.native
  def loadWeights(manifest: WeightsManifestConfig, filePathPrefix: String, weightNames: js.Array[String]): js.Promise[NamedTensorMap] = js.native
  def loadWeights(
    manifest: WeightsManifestConfig,
    filePathPrefix: String,
    weightNames: js.Array[String],
    requestInit: RequestInit
  ): js.Promise[NamedTensorMap] = js.native
  def moveModel(sourceURL: String, destURL: String): js.Promise[ModelArtifactsInfo] = js.native
  def nodeHTTPRequest(path: String): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit): IOHandler = js.native
  def nodeHTTPRequest(path: String, requestInit: RequestInit, weightPathPrefix: String): IOHandler = js.native
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
  def removeModel(url: String): js.Promise[ModelArtifactsInfo] = js.native
  def weightsLoaderFactory(
    fetchWeightsFunction: js.Function1[/* fetchUrls */ js.Array[String], js.Promise[js.Array[js.typedarray.ArrayBuffer]]]
  ): js.Function3[
    /* manifest */ WeightsManifestConfig, 
    /* filePathPrefix */ js.UndefOr[String], 
    /* weightNames */ js.UndefOr[js.Array[String]], 
    js.Promise[NamedTensorMap]
  ] = js.native
  def withSaveHandler(saveHandler: js.Function1[/* artifacts */ ModelArtifacts, js.Promise[SaveResult]]): IOHandler = js.native
}

