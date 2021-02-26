package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryTypes.anon.Data
import typingsSlinky.sentryTypes.anon.Description
import typingsSlinky.sentryTypes.anon.PickSpanContextExcludekey
import typingsSlinky.sentryTypes.anon.Value
import typingsSlinky.sentryTypes.miscMod.ExtractedNodeRequestData
import typingsSlinky.sentryTypes.miscMod.WorkerLocation
import typingsSlinky.sentryTypes.spanMod.Span
import typingsSlinky.sentryTypes.spanMod.SpanContext
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  type CustomSamplingContext = StringDictionary[js.Any]
  
  type Measurements = Record[String, Value]
  
  @js.native
  trait SamplingContext extends CustomSamplingContext {
    
    /**
      * Object representing the URL of the current page or worker script. Passed by default in a browser or service worker
      * context.
      */
    var location: js.UndefOr[WorkerLocation] = js.native
    
    /**
      * Sampling decision from the parent transaction, if any.
      */
    var parentSampled: js.UndefOr[Boolean] = js.native
    
    /**
      * Object representing the incoming request to a node server. Passed by default when using the TracingHandler.
      */
    var request: js.UndefOr[ExtractedNodeRequestData] = js.native
    
    /**
      * Context data with which transaction being sampled was created
      */
    var transactionContext: TransactionContext = js.native
  }
  object SamplingContext {
    
    @scala.inline
    def apply(transactionContext: TransactionContext): SamplingContext = {
      val __obj = js.Dynamic.literal(transactionContext = transactionContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingContext]
    }
    
    @scala.inline
    implicit class SamplingContextMutableBuilder[Self <: SamplingContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: WorkerLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setParentSampled(value: Boolean): Self = StObject.set(x, "parentSampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSampledUndefined: Self = StObject.set(x, "parentSampled", js.undefined)
      
      @scala.inline
      def setRequest(value: ExtractedNodeRequestData): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setTransactionContext(value: TransactionContext): Self = StObject.set(x, "transactionContext", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@sentry/types.@sentry/types/dist/transaction.TransactionContext, 'traceId' | 'parentSpanId' | 'parentSampled'> */
  @js.native
  trait TraceparentData extends StObject {
    
    var parentSampled: js.UndefOr[Boolean] = js.native
    
    var parentSpanId: js.UndefOr[String] = js.native
    
    var traceId: js.UndefOr[String] = js.native
  }
  object TraceparentData {
    
    @scala.inline
    def apply(): TraceparentData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TraceparentData]
    }
    
    @scala.inline
    implicit class TraceparentDataMutableBuilder[Self <: TraceparentData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParentSampled(value: Boolean): Self = StObject.set(x, "parentSampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSampledUndefined: Self = StObject.set(x, "parentSampled", js.undefined)
      
      @scala.inline
      def setParentSpanId(value: String): Self = StObject.set(x, "parentSpanId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSpanIdUndefined: Self = StObject.set(x, "parentSpanId", js.undefined)
      
      @scala.inline
      def setTraceId(value: String): Self = StObject.set(x, "traceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraceIdUndefined: Self = StObject.set(x, "traceId", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.sentryTypes.spanMod.SpanContext because Already inherited
  - typingsSlinky.sentryTypes.spanMod.Span because var conflicts: data, description, endTimestamp, op, parentSpanId, sampled, spanId, startTimestamp, status, tags, traceId. Inlined transaction, finish, finish, setTag, setData, setStatus, setHttpStatus, child, child, startChild, startChild, isSuccess, toTraceparent, getTraceContext, toJSON */ @js.native
  trait Transaction extends TransactionContext {
    
    /**
      * Use {@link startChild}
      * @deprecated
      */
    def child(): Span = js.native
    def child(spanContext: PickSpanContextExcludekey): Span = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("data")
    var data_Transaction: StringDictionary[js.Any] = js.native
    
    /**
      * Sets the finish timestamp on the current span.
      * @param endTimestamp Takes an endTimestamp if the end should not be the time when you call this function.
      */
    def finish(): Unit = js.native
    def finish(endTimestamp: Double): Unit = js.native
    
    /** Convert the object to JSON for w. spans array info only */
    def getTraceContext(): Data = js.native
    
    /**
      * Determines whether span was successful (HTTP200)
      */
    def isSuccess(): Boolean = js.native
    
    /**
      * Sets the data attribute on the current span
      * @param key Data key
      * @param value Data value
      */
    def setData(key: String, value: js.Any): this.type = js.native
    
    /**
      * Sets the status attribute on the current span based on the http code
      * @param httpStatus http code used to set the status
      */
    def setHttpStatus(httpStatus: Double): this.type = js.native
    
    /**
      * Set the name of the transaction
      */
    def setName(name: String): Unit = js.native
    
    /**
      * Sets the status attribute on the current span
      * See: {@sentry/tracing SpanStatus} for possible values
      * @param status http code used to set the status
      */
    def setStatus(status: String): this.type = js.native
    
    /**
      * Sets the tag attribute on the current span
      * @param key Tag key
      * @param value Tag value
      */
    def setTag(key: String, value: String): this.type = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("spanId")
    var spanId_Transaction: String = js.native
    
    /**
      * Creates a new `Span` while setting the current `Span.id` as `parentSpanId`.
      * Also the `sampled` decision will be inherited.
      */
    def startChild(): Span = js.native
    def startChild(spanContext: PickSpanContextExcludekey): Span = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("startTimestamp")
    var startTimestamp_Transaction: Double = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("tags")
    var tags_Transaction: StringDictionary[String] = js.native
    
    /** Convert the object to JSON */
    def toJSON(): Description = js.native
    
    /** Return a traceparent compatible header string */
    def toTraceparent(): String = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("traceId")
    var traceId_Transaction: String = js.native
    
    /**
      * The transaction containing this span
      */
    var transaction: js.UndefOr[Transaction] = js.native
  }
  
  @js.native
  trait TransactionContext extends SpanContext {
    
    /**
      * Human-readable identifier for the transaction
      */
    var name: String = js.native
    
    /**
      * If this transaction has a parent, the parent's sampling decision
      */
    var parentSampled: js.UndefOr[Boolean] = js.native
    
    /**
      * If true, sets the end timestamp of the transaction to the highest timestamp of child spans, trimming
      * the duration of the transaction. This is useful to discard extra time in the transaction that is not
      * accounted for in child spans, like what happens in the idle transaction Tracing integration, where we finish the
      * transaction after a given "idle time" and we don't want this "idle time" to be part of the transaction.
      */
    var trimEnd: js.UndefOr[Boolean] = js.native
  }
  object TransactionContext {
    
    @scala.inline
    def apply(name: String): TransactionContext = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransactionContext]
    }
    
    @scala.inline
    implicit class TransactionContextMutableBuilder[Self <: TransactionContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSampled(value: Boolean): Self = StObject.set(x, "parentSampled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentSampledUndefined: Self = StObject.set(x, "parentSampled", js.undefined)
      
      @scala.inline
      def setTrimEnd(value: Boolean): Self = StObject.set(x, "trimEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimEndUndefined: Self = StObject.set(x, "trimEnd", js.undefined)
    }
  }
}
