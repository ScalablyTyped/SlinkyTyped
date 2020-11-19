package typingsSlinky.watsonDeveloperCloud.recognizeStreamMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * pipe()-able Node.js Readable/Writeable stream - accepts binary audio and emits text in its `data` events.
  * Also emits `results` events with interim results and other data.
  *
  * Cannot be instantiated directly, instead created by calling #recognizeUsingWebSocket()
  *
  * Uses WebSockets under the hood. For audio with no recognizable speech, no `data` events are emitted.
  * @param {Object} options
  * @constructor
  */
@JSImport("watson-developer-cloud/lib/recognize-stream", JSImport.Namespace)
@js.native
class ^ protected () extends RecognizeStream {
  /**
    * pipe()-able Node.js Duplex stream - accepts binary audio and emits text/objects in it's `data` events.
    *
    * Uses WebSockets under the hood. For audio with no recognizable speech, no `data` events are emitted.
    *
    * By default, only finalized text is emitted in the data events, however when `objectMode`/`readableObjectMode` and `interim_results` are enabled, both interim and final results objects are emitted.
    * WriteableElementStream uses this, for example, to live-update the DOM with word-by-word transcriptions.
    *
    * Note that the WebSocket connection is not established until the first chunk of data is recieved. This allows for auto-detection of content type (for wav/flac/opus audio).
    *
    * @param {Object} options
    * @param {String} [options.model='en-US_BroadbandModel'] - voice model to use. Microphone streaming only supports broadband models.
    * @param {String} [options.url='wss://stream.watsonplatform.net/speech-to-text/api'] base URL for service
    * @param {String} [options.token] - Auth token
    * @param {String} [options.access_token] - IAM auth token
    * @param {Object} [options.headers] - Only works in Node.js, not in browsers. Allows for custom headers to be set, including an Authorization header (preventing the need for auth tokens)
    * @param {String} [options.content-type='audio/wav'] - content type of audio; can be automatically determined from file header in most cases. only wav, flac, ogg/opus, and webm are supported
    * @param {Boolean} [options.interim_results=false] - Send back non-final previews of each "sentence" as it is being processed. These results are ignored in text mode.
    * @param {Boolean} [options.word_confidence=false] - include confidence scores with results.
    * @param {Boolean} [options.timestamps=false] - include timestamps with results.
    * @param {Number} [options.max_alternatives=1] - maximum number of alternative transcriptions to include.
    * @param {Array<String>} [options.keywords] - a list of keywords to search for in the audio
    * @param {Number} [options.keywords_threshold] - Number between 0 and 1 representing the minimum confidence before including a keyword in the results. Required when options.keywords is set
    * @param {Number} [options.word_alternatives_threshold] - Number between 0 and 1 representing the minimum confidence before including an alternative word in the results. Must be set to enable word alternatives,
    * @param {Boolean} [options.profanity_filter=false] - set to true to filter out profanity and replace the words with *'s
    * @param {Number} [options.inactivity_timeout=30] - how many seconds of silence before automatically closing the stream. use -1 for infinity
    * @param {Boolean} [options.readableObjectMode=false] - emit `result` objects instead of string Buffers for the `data` events. Does not affect input (which must be binary)
    * @param {Boolean} [options.objectMode=false] - alias for options.readableObjectMode
    * @param {Number} [options.X-Watson-Learning-Opt-Out=false] - set to true to opt-out of allowing Watson to use this request to improve it's services
    * @param {Boolean} [options.smart_formatting=false] - formats numeric values such as dates, times, currency, etc.
    * @param {String} [options.language_customization_id] - Language customization ID
    * @param {String} [options.customization_id] - Customization ID (DEPRECATED)
    * @param {String} [options.acoustic_customization_id] - Acoustic customization ID
    * @param {IamTokenManagerV1} [options.token_manager] - Token manager for authenticating with IAM
    * @param {string} [options.base_model_version] - The version of the specified base model that is to be used with recognition request or, for the **Create a session** method, with the new session.
    * Multiple versions of a base model can exist when a model is updated for internal improvements. The parameter is intended primarily for use with custom models that have been upgraded for a new base model.
    * The default value depends on whether the parameter is used with or without a custom model. For more information, see [Base model version](https://console.bluemix.net/docs/services/speech-to-text/input.html#version).
    * @param {Boolean} [options.rejectUnauthorized] - If true, disable SSL verification for the WebSocket connection
    * @param {String} [options.grammar_name] - The name of a grammar that is to be used with the recognition request. If you specify a grammar, you must also use the `language_customization_id` parameter to specify the name of the custom language model for which the grammar is defined. The service recognizes only strings that are recognized by the specified grammar; it does not recognize other custom words from the model's words resource. See [Grammars](https://cloud.ibm.com/docs/services/speech-to-text/output.html)
    * @param {Boolean} [options.redaction] - If `true`, the service redacts, or masks, numeric data from final transcripts. The feature redacts any number that has three or more consecutive digits by replacing each digit with an `X` character. It is intended to redact sensitive numeric data, such as credit card numbers. By default, the service performs no redaction. When you enable redaction, the service automatically enables smart formatting, regardless of whether you explicitly disable that feature. To ensure maximum security, the service also disables keyword spotting (ignores the `keywords` and `keywords_threshold` parameters) and returns only a single final transcript (forces the `max_alternatives` parameter to be `1`). **Note:** Applies to US English, Japanese, and Korean transcription only. See [Numeric redaction](https://cloud.ibm.com/docs/services/speech-to-text/output.html#redaction)
    *
    * @constructor
    */
  def this(options: js.Any) = this()
}
@JSImport("watson-developer-cloud/lib/recognize-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var ERROR_UNRECOGNIZED_FORMAT: String = js.native
  
  var WEBSOCKET_CONNECTION_ERROR: String = js.native
  
  def getContentType(buffer: Buffer): String = js.native
}
