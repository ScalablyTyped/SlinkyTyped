package typingsSlinky.sicEcies

import typingsSlinky.bitcoreLib.mod.PrivateKey
import typingsSlinky.bitcoreLib.mod.PublicKey
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @js.native
  trait AES extends StObject {
    
    def apply(): typingsSlinky.sicEcies.mod.AES = js.native
    
    def buf2words(buf: Buffer): js.Array[Double] = js.native
    
    def decrypt(encbuf: Buffer, keybuf: Buffer): Buffer = js.native
    
    def encrypt(messagebuf: Buffer, keybuf: Buffer): Buffer = js.native
    
    def words2buf(words: js.Array[Double]): Buffer = js.native
  }
  @JSImport("sic-ecies", "AES")
  @js.native
  val AES: typingsSlinky.sicEcies.mod.AES = js.native
  
  @js.native
  trait AESCBC extends StObject {
    
    def apply(): typingsSlinky.sicEcies.mod.AESCBC = js.native
    
    def decrypt(encbuf: Buffer, passwordstr: String): Buffer = js.native
    
    def decryptCipherkey(encbuf: Buffer, cipherkeybuf: Buffer): Buffer = js.native
    
    def encrypt(messagebuf: Buffer, passwordstr: String): Buffer = js.native
    
    def encryptCipherkey(messagebuf: Buffer, cipherkeybuf: Buffer, ivbuf: Buffer): Buffer = js.native
  }
  @JSImport("sic-ecies", "AESCBC")
  @js.native
  val AESCBC: typingsSlinky.sicEcies.mod.AESCBC = js.native
  
  @js.native
  trait CBC extends StObject {
    
    def apply(blockcipher: Blockcipher, cipherkeybuf: Buffer, ivbuf: Buffer): typingsSlinky.sicEcies.mod.CBC = js.native
    
    def blockbufs2buf(blockbufs: js.Array[Buffer]): Buffer = js.native
    
    def buf2blockbufs(buf: Buffer, blocksize: Double): js.Array[Buffer] = js.native
    
    def decrypt(encbuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
    
    def decryptblock(encbuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
    
    def decryptblocks(encbufs: js.Array[Buffer], ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): js.Array[Buffer] = js.native
    
    def encrypt(messagebuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
    
    def encryptblock(blockbuf: Buffer, ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): Buffer = js.native
    
    def encryptblocks(blockbufs: js.Array[Buffer], ivbuf: Buffer, blockcipher: Blockcipher, cipherkeybuf: Buffer): js.Array[Buffer] = js.native
    
    def pkcs7pad(buf: Buffer, blocksize: Double): Buffer = js.native
    
    def pkcs7unpad(paddedbuf: Buffer): Buffer = js.native
    
    def xorbufs(buf1: Buffer, buf2: Buffer): Buffer = js.native
  }
  @JSImport("sic-ecies", "CBC")
  @js.native
  val CBC: typingsSlinky.sicEcies.mod.CBC = js.native
  
  @js.native
  trait ECIES extends StObject {
    
    def apply(): typingsSlinky.sicEcies.mod.ECIES = js.native
    def apply(opts: ECIESOptions): typingsSlinky.sicEcies.mod.ECIES = js.native
    
    var Rbuf: Buffer = js.native
    
    def decrypt(encbuf: Buffer): Buffer = js.native
    
    def encrypt(message: String): Buffer = js.native
    def encrypt(message: String, ivbuf: Buffer): Buffer = js.native
    def encrypt(message: Buffer): Buffer = js.native
    def encrypt(message: Buffer, ivbuf: Buffer): Buffer = js.native
    
    var kE: Buffer = js.native
    
    var kEkM: Buffer = js.native
    
    var kM: Buffer = js.native
    
    def privateKey(privateKey: PrivateKey): typingsSlinky.sicEcies.mod.ECIES = js.native
    
    def publicKey(publicKey: PublicKey): typingsSlinky.sicEcies.mod.ECIES = js.native
  }
  @JSImport("sic-ecies", "ECIES")
  @js.native
  val ECIES: typingsSlinky.sicEcies.mod.ECIES = js.native
  
  @js.native
  trait Blockcipher extends StObject {
    
    def decrypt(encbuf: Buffer, cipherkeybuf: Buffer): Buffer = js.native
    
    def encrypt(xorbuf: Buffer, cipherkeybuf: Buffer): Buffer = js.native
  }
  object Blockcipher {
    
    @scala.inline
    def apply(decrypt: (Buffer, Buffer) => Buffer, encrypt: (Buffer, Buffer) => Buffer): Blockcipher = {
      val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt))
      __obj.asInstanceOf[Blockcipher]
    }
    
    @scala.inline
    implicit class BlockcipherMutableBuilder[Self <: Blockcipher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecrypt(value: (Buffer, Buffer) => Buffer): Self = StObject.set(x, "decrypt", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEncrypt(value: (Buffer, Buffer) => Buffer): Self = StObject.set(x, "encrypt", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ECIESOptions extends StObject {
    
    var noKey: js.UndefOr[Boolean] = js.native
    
    var shortTag: js.UndefOr[Boolean] = js.native
  }
  object ECIESOptions {
    
    @scala.inline
    def apply(): ECIESOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ECIESOptions]
    }
    
    @scala.inline
    implicit class ECIESOptionsMutableBuilder[Self <: ECIESOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNoKey(value: Boolean): Self = StObject.set(x, "noKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoKeyUndefined: Self = StObject.set(x, "noKey", js.undefined)
      
      @scala.inline
      def setShortTag(value: Boolean): Self = StObject.set(x, "shortTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortTagUndefined: Self = StObject.set(x, "shortTag", js.undefined)
    }
  }
}
