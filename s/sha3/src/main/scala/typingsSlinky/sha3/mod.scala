package typingsSlinky.sha3

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.sha3.sha3Numbers.`224`
import typingsSlinky.sha3.sha3Numbers.`256`
import typingsSlinky.sha3.sha3Numbers.`384`
import typingsSlinky.sha3.sha3Numbers.`512`
import typingsSlinky.sha3.sha3Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sha3", JSImport.Default)
  @js.native
  class default () extends SHA3
  /* static members */
  object default {
    
    @JSImport("sha3", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sha3", "default.SHA3Hash")
    @js.native
    def SHA3Hash: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
    @scala.inline
    def SHA3Hash_=(x: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA3Hash")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha3", "Keccak")
  @js.native
  class Keccak () extends Hasher {
    def this(size: `224`) = this()
    def this(size: `256`) = this()
    def this(size: `384`) = this()
    def this(size: `512`) = this()
  }
  @JSImport("sha3", "Keccak")
  @js.native
  val Keccak: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  
  @JSImport("sha3", "SHA3")
  @js.native
  class SHA3 () extends Hasher
  /* static members */
  object SHA3 {
    
    @JSImport("sha3", "SHA3")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sha3", "SHA3.SHA3Hash")
    @js.native
    def SHA3Hash: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
    @scala.inline
    def SHA3Hash_=(x: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHA3Hash")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha3", "SHA3Hash")
  @js.native
  class SHA3Hash () extends Hasher {
    def this(size: `224`) = this()
    def this(size: `256`) = this()
    def this(size: `384`) = this()
    def this(size: `512`) = this()
  }
  @JSImport("sha3", "SHA3Hash")
  @js.native
  val SHA3Hash: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sha3", "SHAKE")
  @js.native
  class SHAKE () extends Hasher {
    def this(size: `224`) = this()
    def this(size: `256`) = this()
    def this(size: `384`) = this()
    def this(size: `512`) = this()
  }
  @JSImport("sha3", "SHAKE")
  @js.native
  val SHAKE: Instantiable1[/* size */ js.UndefOr[`224` | `256` | `384` | `512`], Hasher] = js.native
  
  @js.native
  trait Hasher extends StObject {
    
    def digest(): Buffer = js.native
    def digest(encoding: BufferEncoding): String = js.native
    @JSName("digest")
    def digest_binary(encoding: binary): Buffer = js.native
    
    def reset(): this.type = js.native
    
    def update(data: String): this.type = js.native
    def update(data: String, encoding: BufferEncoding): this.type = js.native
    def update(data: Buffer): this.type = js.native
  }
}
