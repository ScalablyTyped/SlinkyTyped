package typingsSlinky.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ruler extends StObject {
  
  var State: js.Any = js.native
  
  var parse: js.Any = js.native
  
  var ruler: After = js.native
  
  var ruler2: After = js.native
  
  var skipToken: js.Any = js.native
  
  var tokenize: js.Any = js.native
}
object Ruler {
  
  @scala.inline
  def apply(State: js.Any, parse: js.Any, ruler: After, ruler2: After, skipToken: js.Any, tokenize: js.Any): Ruler = {
    val __obj = js.Dynamic.literal(State = State.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], ruler = ruler.asInstanceOf[js.Any], ruler2 = ruler2.asInstanceOf[js.Any], skipToken = skipToken.asInstanceOf[js.Any], tokenize = tokenize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ruler]
  }
  
  @scala.inline
  implicit class RulerMutableBuilder[Self <: Ruler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParse(value: js.Any): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler(value: After): Self = StObject.set(x, "ruler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuler2(value: After): Self = StObject.set(x, "ruler2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipToken(value: js.Any): Self = StObject.set(x, "skipToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenize(value: js.Any): Self = StObject.set(x, "tokenize", value.asInstanceOf[js.Any])
  }
}
