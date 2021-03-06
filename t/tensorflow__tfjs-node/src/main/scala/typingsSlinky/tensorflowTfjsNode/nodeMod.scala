package typingsSlinky.tensorflowTfjsNode

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor3D
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor4D
import typingsSlinky.tensorflowTfjsCore.modelTypesMod.MetaGraph
import typingsSlinky.tensorflowTfjsNode.callbacksMod.TensorBoardCallback
import typingsSlinky.tensorflowTfjsNode.callbacksMod.TensorBoardCallbackArgs
import typingsSlinky.tensorflowTfjsNode.savedModelMod.TFSavedModel
import typingsSlinky.tensorflowTfjsNode.tensorboardMod.SummaryFileWriter_
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings._empty
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.cm
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.grayscale
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.in
import typingsSlinky.tensorflowTfjsNode.tensorflowTfjsNodeStrings.rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  object node {
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeBmp")
    @js.native
    def decodeBmp: js.Function2[/* contents */ js.typedarray.Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeBmp")
    @js.native
    def decodeBmp(contents: js.typedarray.Uint8Array): Tensor3D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeBmp")
    @js.native
    def decodeBmp(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
    @scala.inline
    def decodeBmp_=(
      x: js.Function2[/* contents */ js.typedarray.Uint8Array, /* channels */ js.UndefOr[Double], Tensor3D]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeBmp")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeGif")
    @js.native
    def decodeGif: js.Function1[/* contents */ js.typedarray.Uint8Array, Tensor4D] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeGif")
    @js.native
    def decodeGif(contents: js.typedarray.Uint8Array): Tensor4D = js.native
    @scala.inline
    def decodeGif_=(x: js.Function1[/* contents */ js.typedarray.Uint8Array, Tensor4D]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeGif")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage: js.Function4[
        /* content */ js.typedarray.Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* dtype */ js.UndefOr[String], 
        /* expandAnimations */ js.UndefOr[Boolean], 
        Tensor3D | Tensor4D
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(content: js.typedarray.Uint8Array): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(
      content: js.typedarray.Uint8Array,
      channels: js.UndefOr[scala.Nothing],
      dtype: js.UndefOr[scala.Nothing],
      expandAnimations: Boolean
    ): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(content: js.typedarray.Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(
      content: js.typedarray.Uint8Array,
      channels: js.UndefOr[scala.Nothing],
      dtype: String,
      expandAnimations: Boolean
    ): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(content: js.typedarray.Uint8Array, channels: Double): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(
      content: js.typedarray.Uint8Array,
      channels: Double,
      dtype: js.UndefOr[scala.Nothing],
      expandAnimations: Boolean
    ): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D | Tensor4D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeImage")
    @js.native
    def decodeImage(content: js.typedarray.Uint8Array, channels: Double, dtype: String, expandAnimations: Boolean): Tensor3D | Tensor4D = js.native
    @scala.inline
    def decodeImage_=(
      x: js.Function4[
          /* content */ js.typedarray.Uint8Array, 
          /* channels */ js.UndefOr[Double], 
          /* dtype */ js.UndefOr[String], 
          /* expandAnimations */ js.UndefOr[Boolean], 
          Tensor3D | Tensor4D
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeImage")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeJpeg")
    @js.native
    def decodeJpeg: js.Function7[
        /* contents */ js.typedarray.Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* ratio */ js.UndefOr[Double], 
        /* fancyUpscaling */ js.UndefOr[Boolean], 
        /* tryRecoverTruncated */ js.UndefOr[Boolean], 
        /* acceptableFraction */ js.UndefOr[Double], 
        /* dctMethod */ js.UndefOr[String], 
        Tensor3D
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodeJpeg")
    @js.native
    def decodeJpeg(
      contents: js.typedarray.Uint8Array,
      channels: js.UndefOr[Double],
      ratio: js.UndefOr[Double],
      fancyUpscaling: js.UndefOr[Boolean],
      tryRecoverTruncated: js.UndefOr[Boolean],
      acceptableFraction: js.UndefOr[Double],
      dctMethod: js.UndefOr[String]
    ): Tensor3D = js.native
    @scala.inline
    def decodeJpeg_=(
      x: js.Function7[
          /* contents */ js.typedarray.Uint8Array, 
          /* channels */ js.UndefOr[Double], 
          /* ratio */ js.UndefOr[Double], 
          /* fancyUpscaling */ js.UndefOr[Boolean], 
          /* tryRecoverTruncated */ js.UndefOr[Boolean], 
          /* acceptableFraction */ js.UndefOr[Double], 
          /* dctMethod */ js.UndefOr[String], 
          Tensor3D
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodeJpeg")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodePng")
    @js.native
    def decodePng: js.Function3[
        /* contents */ js.typedarray.Uint8Array, 
        /* channels */ js.UndefOr[Double], 
        /* dtype */ js.UndefOr[String], 
        Tensor3D
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodePng")
    @js.native
    def decodePng(contents: js.typedarray.Uint8Array): Tensor3D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodePng")
    @js.native
    def decodePng(contents: js.typedarray.Uint8Array, channels: js.UndefOr[scala.Nothing], dtype: String): Tensor3D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodePng")
    @js.native
    def decodePng(contents: js.typedarray.Uint8Array, channels: Double): Tensor3D = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.decodePng")
    @js.native
    def decodePng(contents: js.typedarray.Uint8Array, channels: Double, dtype: String): Tensor3D = js.native
    @scala.inline
    def decodePng_=(
      x: js.Function3[
          /* contents */ js.typedarray.Uint8Array, 
          /* channels */ js.UndefOr[Double], 
          /* dtype */ js.UndefOr[String], 
          Tensor3D
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decodePng")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodeJpeg")
    @js.native
    def encodeJpeg: js.Function10[
        /* image */ Tensor3D, 
        /* format */ js.UndefOr[_empty | grayscale | rgb], 
        /* quality */ js.UndefOr[Double], 
        /* progressive */ js.UndefOr[Boolean], 
        /* optimizeSize */ js.UndefOr[Boolean], 
        /* chromaDownsampling */ js.UndefOr[Boolean], 
        /* densityUnit */ js.UndefOr[in | cm], 
        /* xDensity */ js.UndefOr[Double], 
        /* yDensity */ js.UndefOr[Double], 
        /* xmpMetadata */ js.UndefOr[String], 
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodeJpeg")
    @js.native
    def encodeJpeg(
      image: Tensor3D,
      format: js.UndefOr[_empty | grayscale | rgb],
      quality: js.UndefOr[Double],
      progressive: js.UndefOr[Boolean],
      optimizeSize: js.UndefOr[Boolean],
      chromaDownsampling: js.UndefOr[Boolean],
      densityUnit: js.UndefOr[in | cm],
      xDensity: js.UndefOr[Double],
      yDensity: js.UndefOr[Double],
      xmpMetadata: js.UndefOr[String]
    ): js.Promise[js.typedarray.Uint8Array] = js.native
    @scala.inline
    def encodeJpeg_=(
      x: js.Function10[
          /* image */ Tensor3D, 
          /* format */ js.UndefOr[_empty | grayscale | rgb], 
          /* quality */ js.UndefOr[Double], 
          /* progressive */ js.UndefOr[Boolean], 
          /* optimizeSize */ js.UndefOr[Boolean], 
          /* chromaDownsampling */ js.UndefOr[Boolean], 
          /* densityUnit */ js.UndefOr[in | cm], 
          /* xDensity */ js.UndefOr[Double], 
          /* yDensity */ js.UndefOr[Double], 
          /* xmpMetadata */ js.UndefOr[String], 
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodeJpeg")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodePng")
    @js.native
    def encodePng: js.Function2[
        /* image */ Tensor3D, 
        /* compression */ js.UndefOr[Double], 
        js.Promise[js.typedarray.Uint8Array]
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodePng")
    @js.native
    def encodePng(image: Tensor3D): js.Promise[js.typedarray.Uint8Array] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.encodePng")
    @js.native
    def encodePng(image: Tensor3D, compression: Double): js.Promise[js.typedarray.Uint8Array] = js.native
    @scala.inline
    def encodePng_=(
      x: js.Function2[
          /* image */ Tensor3D, 
          /* compression */ js.UndefOr[Double], 
          js.Promise[js.typedarray.Uint8Array]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encodePng")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.getMetaGraphsFromSavedModel")
    @js.native
    def getMetaGraphsFromSavedModel: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.getMetaGraphsFromSavedModel")
    @js.native
    def getMetaGraphsFromSavedModel(path: String): js.Promise[js.Array[MetaGraph]] = js.native
    @scala.inline
    def getMetaGraphsFromSavedModel_=(x: js.Function1[/* path */ String, js.Promise[js.Array[MetaGraph]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getMetaGraphsFromSavedModel")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.getNumOfSavedModels")
    @js.native
    def getNumOfSavedModels(): Double = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.getNumOfSavedModels")
    @js.native
    def getNumOfSavedModels_Fnode: js.Function0[Double] = js.native
    
    @scala.inline
    def getNumOfSavedModels_Fnode_=(x: js.Function0[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNumOfSavedModels")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.loadSavedModel")
    @js.native
    def loadSavedModel: js.Function3[
        /* path */ String, 
        /* tags */ js.UndefOr[js.Array[String]], 
        /* signature */ js.UndefOr[String], 
        js.Promise[TFSavedModel]
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.loadSavedModel")
    @js.native
    def loadSavedModel(path: String): js.Promise[TFSavedModel] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.loadSavedModel")
    @js.native
    def loadSavedModel(path: String, tags: js.UndefOr[scala.Nothing], signature: String): js.Promise[TFSavedModel] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.loadSavedModel")
    @js.native
    def loadSavedModel(path: String, tags: js.Array[String]): js.Promise[TFSavedModel] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.loadSavedModel")
    @js.native
    def loadSavedModel(path: String, tags: js.Array[String], signature: String): js.Promise[TFSavedModel] = js.native
    @scala.inline
    def loadSavedModel_=(
      x: js.Function3[
          /* path */ String, 
          /* tags */ js.UndefOr[js.Array[String]], 
          /* signature */ js.UndefOr[String], 
          js.Promise[TFSavedModel]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadSavedModel")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter: js.Function4[
        /* logdir */ String, 
        /* maxQueue */ js.UndefOr[Double], 
        /* flushMillis */ js.UndefOr[Double], 
        /* filenameSuffix */ js.UndefOr[String], 
        SummaryFileWriter_
      ] = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(
      logdir: String,
      maxQueue: js.UndefOr[scala.Nothing],
      flushMillis: js.UndefOr[scala.Nothing],
      filenameSuffix: String
    ): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String, maxQueue: js.UndefOr[scala.Nothing], flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String, maxQueue: Double): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: js.UndefOr[scala.Nothing], filenameSuffix: String): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double): SummaryFileWriter_ = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.summaryFileWriter")
    @js.native
    def summaryFileWriter(logdir: String, maxQueue: Double, flushMillis: Double, filenameSuffix: String): SummaryFileWriter_ = js.native
    @scala.inline
    def summaryFileWriter_=(
      x: js.Function4[
          /* logdir */ String, 
          /* maxQueue */ js.UndefOr[Double], 
          /* flushMillis */ js.UndefOr[Double], 
          /* filenameSuffix */ js.UndefOr[String], 
          SummaryFileWriter_
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("summaryFileWriter")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.tensorBoard")
    @js.native
    def tensorBoard(): TensorBoardCallback = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.tensorBoard")
    @js.native
    def tensorBoard(logdir: js.UndefOr[scala.Nothing], args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.tensorBoard")
    @js.native
    def tensorBoard(logdir: String): TensorBoardCallback = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.tensorBoard")
    @js.native
    def tensorBoard(logdir: String, args: TensorBoardCallbackArgs): TensorBoardCallback = js.native
    @JSImport("@tensorflow/tfjs-node/dist/node", "node.tensorBoard")
    @js.native
    def tensorBoard_Fnode: js.Function2[
        /* logdir */ js.UndefOr[String], 
        /* args */ js.UndefOr[TensorBoardCallbackArgs], 
        TensorBoardCallback
      ] = js.native
    
    @scala.inline
    def tensorBoard_Fnode_=(
      x: js.Function2[
          /* logdir */ js.UndefOr[String], 
          /* args */ js.UndefOr[TensorBoardCallbackArgs], 
          TensorBoardCallback
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tensorBoard")(x.asInstanceOf[js.Any])
  }
}
