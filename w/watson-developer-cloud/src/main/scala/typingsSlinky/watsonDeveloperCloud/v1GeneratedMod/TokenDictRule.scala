package typingsSlinky.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object defining a single tokenizaion rule. */
@js.native
trait TokenDictRule extends StObject {
  
  /** The part of speech that the `text` string belongs to. For example `noun`. Custom parts of speech can be specified. */
  var part_of_speech: String = js.native
  
  /** Array of tokens that represent the content of the `text` field in an alternate character set. */
  var readings: js.UndefOr[js.Array[String]] = js.native
  
  /** The string to tokenize. */
  var text: String = js.native
  
  /** Array of tokens that the `text` field is split into when found. */
  var tokens: js.Array[String] = js.native
}
object TokenDictRule {
  
  @scala.inline
  def apply(part_of_speech: String, text: String, tokens: js.Array[String]): TokenDictRule = {
    val __obj = js.Dynamic.literal(part_of_speech = part_of_speech.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDictRule]
  }
  
  @scala.inline
  implicit class TokenDictRuleMutableBuilder[Self <: TokenDictRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPart_of_speech(value: String): Self = StObject.set(x, "part_of_speech", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadings(value: js.Array[String]): Self = StObject.set(x, "readings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingsUndefined: Self = StObject.set(x, "readings", js.undefined)
    
    @scala.inline
    def setReadingsVarargs(value: String*): Self = StObject.set(x, "readings", js.Array(value :_*))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[String]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: String*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
