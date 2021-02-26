package typingsSlinky.shaJs

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha.js", JSImport.Namespace)
  @js.native
  def apply(algorithm: String): Hash = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha")
  @js.native
  class sha () extends Hash
  @JSImport("sha.js", "sha")
  @js.native
  val sha: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha1")
  @js.native
  class sha1 () extends Hash
  @JSImport("sha.js", "sha1")
  @js.native
  val sha1: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha224")
  @js.native
  class sha224 () extends Hash
  @JSImport("sha.js", "sha224")
  @js.native
  val sha224: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha256")
  @js.native
  class sha256 () extends Hash
  @JSImport("sha.js", "sha256")
  @js.native
  val sha256: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha384")
  @js.native
  class sha384 () extends Hash
  @JSImport("sha.js", "sha384")
  @js.native
  val sha384: HashStatic = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha.js", "sha512")
  @js.native
  class sha512 () extends Hash
  @JSImport("sha.js", "sha512")
  @js.native
  val sha512: HashStatic = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.shaJs.shaJsStrings.sha
    - typingsSlinky.shaJs.shaJsStrings.sha1
    - typingsSlinky.shaJs.shaJsStrings.sha224
    - typingsSlinky.shaJs.shaJsStrings.sha256
    - typingsSlinky.shaJs.shaJsStrings.sha384
    - typingsSlinky.shaJs.shaJsStrings.sha512
  */
  trait Algorithm extends StObject
  object Algorithm {
    
    @scala.inline
    def sha: typingsSlinky.shaJs.shaJsStrings.sha = "sha".asInstanceOf[typingsSlinky.shaJs.shaJsStrings.sha]
    
    @scala.inline
    def sha1: typingsSlinky.shaJs.shaJsStrings.sha1 = "sha1".asInstanceOf[typingsSlinky.shaJs.shaJsStrings.sha1]
    
    @scala.inline
    def sha224: typingsSlinky.shaJs.shaJsStrings.sha224 = "sha224".asInstanceOf[typingsSlinky.shaJs.shaJsStrings.sha224]
    
    @scala.inline
    def sha256: typingsSlinky.shaJs.shaJsStrings.sha256 = "sha256".asInstanceOf[typingsSlinky.shaJs.shaJsStrings.sha256]
    
    @scala.inline
    def sha384: typingsSlinky.shaJs.shaJsStrings.sha384 = "sha384".asInstanceOf[typingsSlinky.shaJs.shaJsStrings.sha384]
    
    @scala.inline
    def sha512: typingsSlinky.shaJs.shaJsStrings.sha512 = "sha512".asInstanceOf[typingsSlinky.shaJs.shaJsStrings.sha512]
  }
  
  @js.native
  trait HashStatic extends Instantiable0[Hash]
}
