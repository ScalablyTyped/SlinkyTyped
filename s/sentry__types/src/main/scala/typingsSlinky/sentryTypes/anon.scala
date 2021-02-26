package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryTypes.contextMod.Contexts
import typingsSlinky.sentryTypes.exceptionMod.Exception
import typingsSlinky.sentryTypes.extraMod.Extras
import typingsSlinky.sentryTypes.scopeMod._CaptureContext
import typingsSlinky.sentryTypes.sessionMod.SessionStatus
import typingsSlinky.sentryTypes.severityMod.Severity
import typingsSlinky.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Attrs extends StObject {
    
    var attrs: js.UndefOr[Environment] = js.native
    
    var did: js.UndefOr[String] = js.native
    
    var duration: Double = js.native
    
    var errors: Double = js.native
    
    var init: Boolean = js.native
    
    var sid: String = js.native
    
    var started: String = js.native
    
    var status: SessionStatus = js.native
    
    var timestamp: String = js.native
  }
  object Attrs {
    
    @scala.inline
    def apply(
      duration: Double,
      errors: Double,
      init: Boolean,
      sid: String,
      started: String,
      status: SessionStatus,
      timestamp: String
    ): Attrs = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attrs]
    }
    
    @scala.inline
    implicit class AttrsMutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttrs(value: Environment): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
      
      @scala.inline
      def setDid(value: String): Self = StObject.set(x, "did", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidUndefined: Self = StObject.set(x, "did", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: Double): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStarted(value: String): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: SessionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var op: js.UndefOr[String] = js.native
    
    var parent_span_id: js.UndefOr[String] = js.native
    
    var span_id: String = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    var trace_id: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(span_id: String, trace_id: String): Data = {
      val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      @scala.inline
      def setParent_span_id(value: String): Self = StObject.set(x, "parent_span_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_span_idUndefined: Self = StObject.set(x, "parent_span_id", js.undefined)
      
      @scala.inline
      def setSpan_id(value: String): Self = StObject.set(x, "span_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Description extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var op: js.UndefOr[String] = js.native
    
    var parent_span_id: js.UndefOr[String] = js.native
    
    var span_id: String = js.native
    
    var start_timestamp: Double = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var trace_id: String = js.native
  }
  object Description {
    
    @scala.inline
    def apply(span_id: String, start_timestamp: Double, trace_id: String): Description = {
      val __obj = js.Dynamic.literal(span_id = span_id.asInstanceOf[js.Any], start_timestamp = start_timestamp.asInstanceOf[js.Any], trace_id = trace_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Description]
    }
    
    @scala.inline
    implicit class DescriptionMutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      @scala.inline
      def setParent_span_id(value: String): Self = StObject.set(x, "parent_span_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent_span_idUndefined: Self = StObject.set(x, "parent_span_id", js.undefined)
      
      @scala.inline
      def setSpan_id(value: String): Self = StObject.set(x, "span_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart_timestamp(value: Double): Self = StObject.set(x, "start_timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setTrace_id(value: String): Self = StObject.set(x, "trace_id", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Environment extends StObject {
    
    var environment: js.UndefOr[String] = js.native
    
    var ip_address: js.UndefOr[String] = js.native
    
    var release: js.UndefOr[String] = js.native
    
    var user_agent: js.UndefOr[String] = js.native
  }
  object Environment {
    
    @scala.inline
    def apply(): Environment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Environment]
    }
    
    @scala.inline
    implicit class EnvironmentMutableBuilder[Self <: Environment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      @scala.inline
      def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp_addressUndefined: Self = StObject.set(x, "ip_address", js.undefined)
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@sentry/types.@sentry/types/dist/scope.ScopeContext> */
  @js.native
  trait PartialScopeContext extends _CaptureContext {
    
    var contexts: js.UndefOr[Contexts] = js.native
    
    var extra: js.UndefOr[Extras] = js.native
    
    var fingerprint: js.UndefOr[js.Array[String]] = js.native
    
    var level: js.UndefOr[Severity] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
    
    var user: js.UndefOr[User] = js.native
  }
  object PartialScopeContext {
    
    @scala.inline
    def apply(): PartialScopeContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialScopeContext]
    }
    
    @scala.inline
    implicit class PartialScopeContextMutableBuilder[Self <: PartialScopeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContexts(value: Contexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
      
      @scala.inline
      def setExtra(value: Extras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
      
      @scala.inline
      def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
      
      @scala.inline
      def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: Severity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  /* Inlined std.Pick<@sentry/types.@sentry/types/dist/span.SpanContext, std.Exclude<keyof @sentry/types.@sentry/types/dist/span.SpanContext, 'spanId' | 'sampled' | 'traceId' | 'parentSpanId'>> */
  @js.native
  trait PickSpanContextExcludekey extends StObject {
    
    var data: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var description: js.UndefOr[String] = js.native
    
    var endTimestamp: js.UndefOr[Double] = js.native
    
    var op: js.UndefOr[String] = js.native
    
    var startTimestamp: js.UndefOr[Double] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object PickSpanContextExcludekey {
    
    @scala.inline
    def apply(): PickSpanContextExcludekey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickSpanContextExcludekey]
    }
    
    @scala.inline
    implicit class PickSpanContextExcludekeyMutableBuilder[Self <: PickSpanContextExcludekey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setEndTimestamp(value: Double): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndTimestampUndefined: Self = StObject.set(x, "endTimestamp", js.undefined)
      
      @scala.inline
      def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
      
      @scala.inline
      def setStartTimestamp(value: Double): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimestampUndefined: Self = StObject.set(x, "startTimestamp", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var value: Double = js.native
  }
  object Value {
    
    @scala.inline
    def apply(value: Double): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Values extends StObject {
    
    var values: js.UndefOr[js.Array[Exception]] = js.native
  }
  object Values {
    
    @scala.inline
    def apply(): Values = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Values]
    }
    
    @scala.inline
    implicit class ValuesMutableBuilder[Self <: Values] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValues(value: js.Array[Exception]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      @scala.inline
      def setValuesVarargs(value: Exception*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
