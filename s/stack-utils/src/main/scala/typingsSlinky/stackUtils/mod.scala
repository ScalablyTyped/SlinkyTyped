package typingsSlinky.stackUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stack-utils", JSImport.Namespace)
  @js.native
  class ^ () extends StackUtils {
    def this(options: Options) = this()
  }
  
  /* static member */
  @JSImport("stack-utils", "nodeInternals")
  @js.native
  def nodeInternals(): js.Array[js.RegExp] = js.native
  
  @js.native
  trait CallSite extends StObject {
    
    def getColumnNumber(): Double = js.native
    
    def getEvalOrigin(): CallSite | String = js.native
    
    def getFileName(): js.UndefOr[String] = js.native
    
    def getFunction(): js.UndefOr[js.Function] = js.native
    
    def getFunctionName(): String = js.native
    
    def getLineNumber(): Double = js.native
    
    def getMethodName(): String | Null = js.native
    
    def getThis(): js.UndefOr[js.Object] = js.native
    
    def getTypeName(): String = js.native
    
    def isConstructor(): Boolean = js.native
    
    def isEval(): Boolean = js.native
    
    def isNative(): Boolean = js.native
    
    def isToplevel(): Boolean = js.native
  }
  object CallSite {
    
    @scala.inline
    def apply(
      getColumnNumber: () => Double,
      getEvalOrigin: () => CallSite | String,
      getFileName: () => js.UndefOr[String],
      getFunction: () => js.UndefOr[js.Function],
      getFunctionName: () => String,
      getLineNumber: () => Double,
      getMethodName: () => String | Null,
      getThis: () => js.UndefOr[js.Object],
      getTypeName: () => String,
      isConstructor: () => Boolean,
      isEval: () => Boolean,
      isNative: () => Boolean,
      isToplevel: () => Boolean
    ): CallSite = {
      val __obj = js.Dynamic.literal(getColumnNumber = js.Any.fromFunction0(getColumnNumber), getEvalOrigin = js.Any.fromFunction0(getEvalOrigin), getFileName = js.Any.fromFunction0(getFileName), getFunction = js.Any.fromFunction0(getFunction), getFunctionName = js.Any.fromFunction0(getFunctionName), getLineNumber = js.Any.fromFunction0(getLineNumber), getMethodName = js.Any.fromFunction0(getMethodName), getThis = js.Any.fromFunction0(getThis), getTypeName = js.Any.fromFunction0(getTypeName), isConstructor = js.Any.fromFunction0(isConstructor), isEval = js.Any.fromFunction0(isEval), isNative = js.Any.fromFunction0(isNative), isToplevel = js.Any.fromFunction0(isToplevel))
      __obj.asInstanceOf[CallSite]
    }
    
    @scala.inline
    implicit class CallSiteMutableBuilder[Self <: CallSite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetColumnNumber(value: () => Double): Self = StObject.set(x, "getColumnNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEvalOrigin(value: () => CallSite | String): Self = StObject.set(x, "getEvalOrigin", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFileName(value: () => js.UndefOr[String]): Self = StObject.set(x, "getFileName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunction(value: () => js.UndefOr[js.Function]): Self = StObject.set(x, "getFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetFunctionName(value: () => String): Self = StObject.set(x, "getFunctionName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLineNumber(value: () => Double): Self = StObject.set(x, "getLineNumber", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMethodName(value: () => String | Null): Self = StObject.set(x, "getMethodName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThis(value: () => js.UndefOr[js.Object]): Self = StObject.set(x, "getThis", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTypeName(value: () => String): Self = StObject.set(x, "getTypeName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsConstructor(value: () => Boolean): Self = StObject.set(x, "isConstructor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsEval(value: () => Boolean): Self = StObject.set(x, "isEval", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsNative(value: () => Boolean): Self = StObject.set(x, "isNative", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsToplevel(value: () => Boolean): Self = StObject.set(x, "isToplevel", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CallSiteLike extends StackData {
    
    var `type`: js.UndefOr[String] = js.native
  }
  object CallSiteLike {
    
    @scala.inline
    def apply(): CallSiteLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallSiteLike]
    }
    
    @scala.inline
    implicit class CallSiteLikeMutableBuilder[Self <: CallSiteLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var ignoredPackages: js.UndefOr[js.Array[String]] = js.native
    
    var internals: js.UndefOr[js.Array[js.RegExp]] = js.native
    
    var wrapCallSite: js.UndefOr[js.Function1[/* callSite */ CallSite, CallSite]] = js.native
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
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setIgnoredPackages(value: js.Array[String]): Self = StObject.set(x, "ignoredPackages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoredPackagesUndefined: Self = StObject.set(x, "ignoredPackages", js.undefined)
      
      @scala.inline
      def setIgnoredPackagesVarargs(value: String*): Self = StObject.set(x, "ignoredPackages", js.Array(value :_*))
      
      @scala.inline
      def setInternals(value: js.Array[js.RegExp]): Self = StObject.set(x, "internals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalsUndefined: Self = StObject.set(x, "internals", js.undefined)
      
      @scala.inline
      def setInternalsVarargs(value: js.RegExp*): Self = StObject.set(x, "internals", js.Array(value :_*))
      
      @scala.inline
      def setWrapCallSite(value: /* callSite */ CallSite => CallSite): Self = StObject.set(x, "wrapCallSite", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWrapCallSiteUndefined: Self = StObject.set(x, "wrapCallSite", js.undefined)
    }
  }
  
  @js.native
  trait StackData extends StObject {
    
    var column: js.UndefOr[Double] = js.native
    
    var constructor: js.UndefOr[Boolean] = js.native
    
    var evalOrigin: js.UndefOr[String] = js.native
    
    var file: js.UndefOr[String] = js.native
    
    var function: js.UndefOr[String] = js.native
    
    var line: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var native: js.UndefOr[Boolean] = js.native
  }
  object StackData {
    
    @scala.inline
    def apply(): StackData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackData]
    }
    
    @scala.inline
    implicit class StackDataMutableBuilder[Self <: StackData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      @scala.inline
      def setConstructor(value: Boolean): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      @scala.inline
      def setEvalOrigin(value: String): Self = StObject.set(x, "evalOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalOriginUndefined: Self = StObject.set(x, "evalOrigin", js.undefined)
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    }
  }
  
  @js.native
  trait StackLineData extends StackData {
    
    var evalColumn: js.UndefOr[Double] = js.native
    
    var evalFile: js.UndefOr[String] = js.native
    
    var evalLine: js.UndefOr[Double] = js.native
  }
  object StackLineData {
    
    @scala.inline
    def apply(): StackLineData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackLineData]
    }
    
    @scala.inline
    implicit class StackLineDataMutableBuilder[Self <: StackLineData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvalColumn(value: Double): Self = StObject.set(x, "evalColumn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalColumnUndefined: Self = StObject.set(x, "evalColumn", js.undefined)
      
      @scala.inline
      def setEvalFile(value: String): Self = StObject.set(x, "evalFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalFileUndefined: Self = StObject.set(x, "evalFile", js.undefined)
      
      @scala.inline
      def setEvalLine(value: Double): Self = StObject.set(x, "evalLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvalLineUndefined: Self = StObject.set(x, "evalLine", js.undefined)
    }
  }
  
  @js.native
  trait StackUtils extends StObject {
    
    def at(): CallSiteLike = js.native
    def at(startStackFunction: js.Function): CallSiteLike = js.native
    
    def capture(): js.Array[CallSite] = js.native
    def capture(limit: js.UndefOr[scala.Nothing], startStackFunction: js.Function): js.Array[CallSite] = js.native
    def capture(limit: Double): js.Array[CallSite] = js.native
    def capture(limit: Double, startStackFunction: js.Function): js.Array[CallSite] = js.native
    def capture(startStackFunction: js.Function): js.Array[CallSite] = js.native
    
    def captureString(): String = js.native
    def captureString(limit: js.UndefOr[scala.Nothing], startStackFunction: js.Function): String = js.native
    def captureString(limit: Double): String = js.native
    def captureString(limit: Double, startStackFunction: js.Function): String = js.native
    def captureString(startStackFunction: js.Function): String = js.native
    
    def clean(stack: String): String = js.native
    def clean(stack: js.Array[String]): String = js.native
    
    def parseLine(line: String): StackLineData | Null = js.native
  }
}
