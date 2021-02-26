package typingsSlinky.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.sentryTypes.breadcrumbMod.Breadcrumb
import typingsSlinky.sentryTypes.contextMod.Context
import typingsSlinky.sentryTypes.contextMod.Contexts
import typingsSlinky.sentryTypes.eventprocessorMod.EventProcessor
import typingsSlinky.sentryTypes.extraMod.Extra
import typingsSlinky.sentryTypes.extraMod.Extras
import typingsSlinky.sentryTypes.sessionMod.Session
import typingsSlinky.sentryTypes.severityMod.Severity
import typingsSlinky.sentryTypes.spanMod.Span
import typingsSlinky.sentryTypes.transactionMod.Transaction
import typingsSlinky.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.sentryTypes.scopeMod.Scope
    - typingsSlinky.sentryTypes.anon.PartialScopeContext
    - js.Function1[
  / * scope * / typingsSlinky.sentryTypes.scopeMod.Scope, 
  typingsSlinky.sentryTypes.scopeMod.Scope]
  */
  type CaptureContext = _CaptureContext | (js.Function1[/* scope */ Scope, Scope])
  
  @js.native
  trait Scope extends _CaptureContext {
    
    /**
      * Sets the breadcrumbs in the scope
      * @param breadcrumbs Breadcrumb
      * @param maxBreadcrumbs number of max breadcrumbs to merged into event.
      */
    def addBreadcrumb(breadcrumb: Breadcrumb): this.type = js.native
    def addBreadcrumb(breadcrumb: Breadcrumb, maxBreadcrumbs: Double): this.type = js.native
    
    /** Add new event processor that will be called after {@link applyToEvent}. */
    def addEventProcessor(callback: EventProcessor): this.type = js.native
    
    /** Clears the current scope and resets its properties. */
    def clear(): this.type = js.native
    
    /**
      * Clears all currently set Breadcrumbs.
      */
    def clearBreadcrumbs(): this.type = js.native
    
    /**
      * Returns the `Session` if there is one
      */
    def getSession(): js.UndefOr[Session] = js.native
    
    /**
      * Returns the `Span` if there is one
      */
    def getSpan(): js.UndefOr[Span] = js.native
    
    /**
      * Returns the `Transaction` attached to the scope (if there is one)
      */
    def getTransaction(): js.UndefOr[Transaction] = js.native
    
    /**
      * Returns the `User` if there is one
      */
    def getUser(): js.UndefOr[User] = js.native
    
    /**
      * Sets context data with the given name.
      * @param name of the context
      * @param context an object containing context data. This data will be normalized. Pass `null` to unset the context.
      */
    def setContext(name: String): this.type = js.native
    def setContext(name: String, context: Context): this.type = js.native
    
    /**
      * Set key:value that will be sent as extra data with the event.
      * @param key String of extra
      * @param extra Any kind of data. This data will be normalized.
      */
    def setExtra(key: String, extra: Extra): this.type = js.native
    
    /**
      * Set an object that will be merged sent as extra data with the event.
      * @param extras Extras object to merge into current context.
      */
    def setExtras(extras: Extras): this.type = js.native
    
    /**
      * Sets the fingerprint on the scope to send with the events.
      * @param fingerprint string[] to group events in Sentry.
      */
    def setFingerprint(fingerprint: js.Array[String]): this.type = js.native
    
    /**
      * Sets the level on the scope for future events.
      * @param level string {@link Severity}
      */
    def setLevel(level: Severity): this.type = js.native
    
    /**
      * Sets the `Session` on the scope
      */
    def setSession(): this.type = js.native
    def setSession(session: Session): this.type = js.native
    
    /**
      * Sets the Span on the scope.
      * @param span Span
      */
    def setSpan(): this.type = js.native
    def setSpan(span: Span): this.type = js.native
    
    /**
      * Set key:value that will be sent as tags data with the event.
      * @param key String key of tag
      * @param value String value of tag
      */
    def setTag(key: String, value: String): this.type = js.native
    
    /**
      * Set an object that will be merged sent as tags data with the event.
      * @param tags Tags context object to merge into current context.
      */
    def setTags(tags: StringDictionary[String]): this.type = js.native
    
    /**
      * Sets the transaction name on the scope for future events.
      */
    def setTransactionName(): this.type = js.native
    def setTransactionName(name: String): this.type = js.native
    
    /**
      * Updates user context information for future events.
      *
      * @param user User context object to be set in the current context. Pass `null` to unset the user.
      */
    def setUser(): this.type = js.native
    def setUser(user: User): this.type = js.native
    
    /**
      * Updates the scope with provided data. Can work in three variations:
      * - plain object containing updatable attributes
      * - Scope instance that'll extract the attributes from
      * - callback function that'll receive the current scope as an argument and allow for modifications
      * @param captureContext scope modifier to be used
      */
    def update(): this.type = js.native
    def update(captureContext: CaptureContext): this.type = js.native
  }
  
  @js.native
  trait ScopeContext extends StObject {
    
    var contexts: Contexts = js.native
    
    var extra: Extras = js.native
    
    var fingerprint: js.Array[String] = js.native
    
    var level: Severity = js.native
    
    var tags: StringDictionary[String] = js.native
    
    var user: User = js.native
  }
  object ScopeContext {
    
    @scala.inline
    def apply(
      contexts: Contexts,
      extra: Extras,
      fingerprint: js.Array[String],
      level: Severity,
      tags: StringDictionary[String],
      user: User
    ): ScopeContext = {
      val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScopeContext]
    }
    
    @scala.inline
    implicit class ScopeContextMutableBuilder[Self <: ScopeContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContexts(value: Contexts): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtra(value: Extras): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprint(value: js.Array[String]): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFingerprintVarargs(value: String*): Self = StObject.set(x, "fingerprint", js.Array(value :_*))
      
      @scala.inline
      def setLevel(value: Severity): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
  
  trait _CaptureContext extends StObject
}
