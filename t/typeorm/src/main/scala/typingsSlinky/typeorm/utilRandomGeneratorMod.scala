package typingsSlinky.typeorm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/util/RandomGenerator", JSImport.Namespace)
@js.native
object utilRandomGeneratorMod extends js.Object {
  
  @js.native
  class RandomGenerator () extends js.Object
  /* static members */
  @js.native
  object RandomGenerator extends js.Object {
    
    /**
      *  discuss at: http://locutus.io/php/sha1/
      * original by: Webtoolkit.info (http://www.webtoolkit.info/)
      * improved by: Michael White (http://getsprink.com)
      * improved by: Kevin van Zonneveld (http://kvz.io)
      *    input by: Brett Zamir (http://brett-zamir.me)
      *      note 1: Keep in mind that in accordance with PHP, the whole string is buffered and then
      *      note 1: hashed. If available, we'd recommend using Node's native crypto modules directly
      *      note 1: in a steaming fashion for faster and more efficient hashing
      *   example 1: sha1('Kevin van Zonneveld')
      *   returns 1: '54916d2e62f65b3afa6e192e6a601cdbe5cb5897'
      */
    def sha1(str: String): String = js.native
    
    /**
      * RFC4122 compliant UUID v4 generator.
      */
    def uuid4(): String = js.native
  }
}
