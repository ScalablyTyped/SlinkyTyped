package typingsSlinky.sidewayAddress.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ip {
  
  /**
    * Generates a regular expression used to validate IP addresses.
    * 
    * @param options - optional settings.
    * 
    * @returns an object with the regular expression and meta data.
    */
  @JSImport("@sideway/address", "ip.regex")
  @js.native
  def regex(): Expression = js.native
  @JSImport("@sideway/address", "ip.regex")
  @js.native
  def regex(options: Options): Expression = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sidewayAddress.sidewayAddressStrings.optional
    - typingsSlinky.sidewayAddress.sidewayAddressStrings.required
    - typingsSlinky.sidewayAddress.sidewayAddressStrings.forbidden
  */
  trait Cidr extends StObject
  object Cidr {
    
    @scala.inline
    def forbidden: typingsSlinky.sidewayAddress.sidewayAddressStrings.forbidden = "forbidden".asInstanceOf[typingsSlinky.sidewayAddress.sidewayAddressStrings.forbidden]
    
    @scala.inline
    def optional: typingsSlinky.sidewayAddress.sidewayAddressStrings.optional = "optional".asInstanceOf[typingsSlinky.sidewayAddress.sidewayAddressStrings.optional]
    
    @scala.inline
    def required: typingsSlinky.sidewayAddress.sidewayAddressStrings.required = "required".asInstanceOf[typingsSlinky.sidewayAddress.sidewayAddressStrings.required]
  }
  
  @js.native
  trait Expression extends StObject {
    
    /**
      * The CIDR mode.
      */
    var cidr: Cidr = js.native
    
    /**
      * The raw regular expression string.
      */
    var raw: String = js.native
    
    /**
      * The regular expression.
      */
    var regex: js.RegExp = js.native
    
    /**
      * The array of versions allowed.
      */
    var versions: js.Array[Version] = js.native
  }
  object Expression {
    
    @scala.inline
    def apply(cidr: Cidr, raw: String, regex: js.RegExp, versions: js.Array[Version]): Expression = {
      val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersions(value: js.Array[Version]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionsVarargs(value: Version*): Self = StObject.set(x, "versions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The required CIDR mode.
      * 
      * @default 'optional'
      */
    val cidr: js.UndefOr[Cidr] = js.native
    
    /**
      * The allowed versions.
      * 
      * @default ['ipv4', 'ipv6', 'ipvfuture']
      */
    val version: js.UndefOr[Version | js.Array[Version]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidr(value: Cidr): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
      
      @scala.inline
      def setVersion(value: Version | js.Array[Version]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      @scala.inline
      def setVersionVarargs(value: Version*): Self = StObject.set(x, "version", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sidewayAddress.sidewayAddressStrings.ipv4
    - typingsSlinky.sidewayAddress.sidewayAddressStrings.ipv6
    - typingsSlinky.sidewayAddress.sidewayAddressStrings.ipvfuture
  */
  trait Version extends StObject
  object Version {
    
    @scala.inline
    def ipv4: typingsSlinky.sidewayAddress.sidewayAddressStrings.ipv4 = "ipv4".asInstanceOf[typingsSlinky.sidewayAddress.sidewayAddressStrings.ipv4]
    
    @scala.inline
    def ipv6: typingsSlinky.sidewayAddress.sidewayAddressStrings.ipv6 = "ipv6".asInstanceOf[typingsSlinky.sidewayAddress.sidewayAddressStrings.ipv6]
    
    @scala.inline
    def ipvfuture: typingsSlinky.sidewayAddress.sidewayAddressStrings.ipvfuture = "ipvfuture".asInstanceOf[typingsSlinky.sidewayAddress.sidewayAddressStrings.ipvfuture]
  }
}
