package typingsSlinky.tensorflowModelsUniversalSentenceEncoder.useQnaMod

import typingsSlinky.tensorflowTfjsConverter.mod.GraphModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow-models/universal-sentence-encoder/dist/use_qna", "UniversalSentenceEncoderQnA")
@js.native
class UniversalSentenceEncoderQnA () extends js.Object {
  
  /**
    *
    * Returns a map of queryEmbedding and responseEmbedding
    *
    * @param input the ModelInput that contains queries and answers.
    */
  def embed(input: ModelInput): ModelOutput = js.native
  
  def load(): js.Promise[Unit] = js.native
  
  def loadModel(): js.Promise[GraphModel] = js.native
  
  var model: js.Any = js.native
  
  var shiftTokens: js.Any = js.native
  
  var tokenizeStrings: js.Any = js.native
  
  var tokenizer: js.Any = js.native
}
