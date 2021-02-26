package typingsSlinky.tensorflowModelsUniversalSentenceEncoder

import typingsSlinky.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Vocabulary
import typingsSlinky.tensorflowModelsUniversalSentenceEncoder.useQnaMod.UniversalSentenceEncoderQnA
import typingsSlinky.tensorflowTfjsConverter.mod.GraphModel
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "Tokenizer")
  @js.native
  class Tokenizer protected ()
    extends typingsSlinky.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Tokenizer {
    def this(vocabulary: Vocabulary) = this()
    def this(vocabulary: Vocabulary, reservedSymbolsCount: Double) = this()
  }
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "UniversalSentenceEncoder")
  @js.native
  class UniversalSentenceEncoder () extends StObject {
    
    def embed(inputs: String): js.Promise[Tensor2D] = js.native
    /**
      *
      * Returns a 2D Tensor of shape [input.length, 512] that contains the
      * Universal Sentence Encoder embeddings for each input.
      *
      * @param inputs A string or an array of strings to embed.
      */
    def embed(inputs: js.Array[String]): js.Promise[Tensor2D] = js.native
    
    def load(): js.Promise[Unit] = js.native
    
    def loadModel(): js.Promise[GraphModel] = js.native
    
    var model: js.Any = js.native
    
    var tokenizer: js.Any = js.native
  }
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "load")
  @js.native
  def load(): js.Promise[UniversalSentenceEncoder] = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "loadQnA")
  @js.native
  def loadQnA(): js.Promise[UniversalSentenceEncoderQnA] = js.native
  
  @JSImport("@tensorflow-models/universal-sentence-encoder", "version")
  @js.native
  val version: /* "1.3.2" */ String = js.native
}
