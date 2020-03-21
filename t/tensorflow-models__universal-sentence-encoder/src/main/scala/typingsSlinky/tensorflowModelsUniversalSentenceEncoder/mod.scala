package typingsSlinky.tensorflowModelsUniversalSentenceEncoder

import typingsSlinky.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Vocabulary
import typingsSlinky.tensorflowTfjsConverter.mod.GraphModel
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow-models/universal-sentence-encoder", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Tokenizer protected ()
    extends typingsSlinky.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Tokenizer {
    def this(vocabulary: Vocabulary) = this()
  }
  
  @js.native
  class UniversalSentenceEncoder () extends js.Object {
    var model: js.Any = js.native
    var tokenizer: js.Any = js.native
    def embed(inputs: String): js.Promise[Tensor2D] = js.native
    def embed(inputs: js.Array[String]): js.Promise[Tensor2D] = js.native
    def load(): js.Promise[Unit] = js.native
    def loadModel(): js.Promise[GraphModel] = js.native
  }
  
  def load(): js.Promise[UniversalSentenceEncoder] = js.native
  def loadTokenizer(): js.Promise[typingsSlinky.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Tokenizer] = js.native
  def loadTokenizer(pathToVocabulary: String): js.Promise[typingsSlinky.tensorflowModelsUniversalSentenceEncoder.tokenizerMod.Tokenizer] = js.native
}

