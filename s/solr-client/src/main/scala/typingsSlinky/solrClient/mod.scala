package typingsSlinky.solrClient

import typingsSlinky.node.httpMod.ClientRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("solr-client", "createClient")
  @js.native
  def createClient(): Client = js.native
  @JSImport("solr-client", "createClient")
  @js.native
  def createClient(options: Options): Client = js.native
  
  @js.native
  trait AddRemoteResourceOptions extends StObject {
    
    var contentType: String = js.native
    
    var format: String = js.native
    
    var parameters: js.Object = js.native
    
    var path: String = js.native
  }
  object AddRemoteResourceOptions {
    
    @scala.inline
    def apply(contentType: String, format: String, parameters: js.Object, path: String): AddRemoteResourceOptions = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddRemoteResourceOptions]
    }
    
    @scala.inline
    implicit class AddRemoteResourceOptionsMutableBuilder[Self <: AddRemoteResourceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Client extends StObject {
    
    def add(docs: js.Array[js.Object]): ClientRequest = js.native
    def add(
      docs: js.Array[js.Object],
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def add(docs: js.Array[js.Object], options: Options): ClientRequest = js.native
    def add(
      docs: js.Array[js.Object],
      options: Options,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def addRemoteResource(options: AddRemoteResourceOptions): ClientRequest = js.native
    def addRemoteResource(
      options: AddRemoteResourceOptions,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def atomicUpdate(doc: js.Object): ClientRequest = js.native
    def atomicUpdate(doc: js.Object, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def basicAuth(username: String, password: String): Client = js.native
    
    def commit(): ClientRequest = js.native
    def commit(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def commit(options: Options): ClientRequest = js.native
    def commit(options: Options, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def delete(field: String, text: String): ClientRequest = js.native
    def delete(
      field: String,
      text: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def delete(field: String, text: String, options: Options): ClientRequest = js.native
    def delete(
      field: String,
      text: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def deleteAll(): ClientRequest = js.native
    def deleteAll(
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteAll(options: Options): ClientRequest = js.native
    def deleteAll(options: Options, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def deleteByID(id: String): ClientRequest = js.native
    def deleteByID(
      id: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByID(id: String, options: Options): ClientRequest = js.native
    def deleteByID(
      id: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByID(id: Double): ClientRequest = js.native
    def deleteByID(
      id: Double,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByID(id: Double, options: Options): ClientRequest = js.native
    def deleteByID(
      id: Double,
      options: Options,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def deleteByQuery(query: String): ClientRequest = js.native
    def deleteByQuery(
      query: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByQuery(query: String, options: Options): ClientRequest = js.native
    def deleteByQuery(
      query: String,
      options: Options,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def deleteByRange(field: String, start: String, stop: String): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: String,
      stop: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: String, stop: String, options: js.Object): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: String,
      stop: String,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: String, stop: js.Date): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: String,
      stop: js.Date,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: String, stop: js.Date, options: js.Object): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: String,
      stop: js.Date,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: js.Date, stop: String): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: js.Date,
      stop: String,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: js.Date, stop: String, options: js.Object): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: js.Date,
      stop: String,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: js.Date, stop: js.Date): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: js.Date,
      stop: js.Date,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def deleteByRange(field: String, start: js.Date, stop: js.Date, options: js.Object): ClientRequest = js.native
    def deleteByRange(
      field: String,
      start: js.Date,
      stop: js.Date,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def escapeSpecialChars(s: String): String = js.native
    
    def executeCollection(collection: String): ClientRequest = js.native
    def executeCollection(collection: String, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    def executeCollection(collection: js.Object): ClientRequest = js.native
    def executeCollection(collection: js.Object, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    def executeCollection(collection: Query): ClientRequest = js.native
    def executeCollection(collection: Query, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def get(handler: String, query: String): ClientRequest = js.native
    def get(
      handler: String,
      query: String,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def get(handler: String, query: js.Object): ClientRequest = js.native
    def get(
      handler: String,
      query: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def get(handler: String, query: Query): ClientRequest = js.native
    def get(
      handler: String,
      query: Query,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def optimize(options: js.Object): ClientRequest = js.native
    def optimize(options: js.Object, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def post(handler: String, query: String): ClientRequest = js.native
    def post(
      handler: String,
      query: String,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def post(handler: String, query: js.Object): ClientRequest = js.native
    def post(
      handler: String,
      query: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def post(handler: String, query: Query): ClientRequest = js.native
    def post(
      handler: String,
      query: Query,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def prepareCommit(): ClientRequest = js.native
    def prepareCommit(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def query(): Query = js.native
    
    def realTimeGet(ids: String): ClientRequest = js.native
    def realTimeGet(
      ids: String,
      query: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def realTimeGet(ids: String, query: Query): ClientRequest = js.native
    def realTimeGet(ids: String, query: Query, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    def realTimeGet(ids: js.Array[String]): ClientRequest = js.native
    def realTimeGet(
      ids: js.Array[String],
      query: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def realTimeGet(ids: js.Array[String], query: Query): ClientRequest = js.native
    def realTimeGet(
      ids: js.Array[String],
      query: Query,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    
    def rollback(): ClientRequest = js.native
    def rollback(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def search(query: Query): ClientRequest = js.native
    def search(query: Query, callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def searchAll(): ClientRequest = js.native
    def searchAll(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def searchAsync(query: Query): js.Promise[js.Object] = js.native
    
    def softCommit(): ClientRequest = js.native
    def softCommit(callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]): ClientRequest = js.native
    
    def unauth(): Client = js.native
    
    def update(data: js.Object): ClientRequest = js.native
    def update(
      data: js.Object,
      options: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
    def update(data: js.Object, options: js.Object): ClientRequest = js.native
    def update(
      data: js.Object,
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* data */ js.Object, Unit]
    ): ClientRequest = js.native
  }
  
  @js.native
  trait FacetOptions extends StObject {
    
    var field: js.UndefOr[String | js.Array[String]] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var mincout: js.UndefOr[Double] = js.native
    
    var missing: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var on: Boolean = js.native
    
    var pivot: js.UndefOr[String | js.Array[String]] = js.native
    
    var prefix: String = js.native
    
    var query: js.UndefOr[String] = js.native
    
    var sort: js.UndefOr[String] = js.native
  }
  object FacetOptions {
    
    @scala.inline
    def apply(on: Boolean, prefix: String): FacetOptions = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[FacetOptions]
    }
    
    @scala.inline
    implicit class FacetOptionsMutableBuilder[Self <: FacetOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String | js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMincout(value: Double): Self = StObject.set(x, "mincout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMincoutUndefined: Self = StObject.set(x, "mincout", js.undefined)
      
      @scala.inline
      def setMissing(value: Boolean): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivot(value: String | js.Array[String]): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
      
      @scala.inline
      def setPivotVarargs(value: String*): Self = StObject.set(x, "pivot", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  @js.native
  trait GroupOptions extends StObject {
    
    var cache: js.UndefOr[Double] = js.native
    
    var field: js.UndefOr[String | js.Array[String]] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var limit: js.UndefOr[Double] = js.native
    
    var main: js.UndefOr[Boolean] = js.native
    
    var ngroups: js.UndefOr[Boolean] = js.native
    
    var offset: js.UndefOr[Double] = js.native
    
    var on: js.UndefOr[Boolean] = js.native
    
    var sort: js.UndefOr[String] = js.native
    
    var truncate: js.UndefOr[Boolean] = js.native
  }
  object GroupOptions {
    
    @scala.inline
    def apply(): GroupOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupOptions]
    }
    
    @scala.inline
    implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Double): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setField(value: String | js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      @scala.inline
      def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value :_*))
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMain(value: Boolean): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setNgroups(value: Boolean): Self = StObject.set(x, "ngroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNgroupsUndefined: Self = StObject.set(x, "ngroups", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      @scala.inline
      def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
    }
  }
  
  @js.native
  trait HighlightOptions extends StObject {
    
    var alternateField: js.UndefOr[String] = js.native
    
    var fl: js.UndefOr[String | js.Array[String]] = js.native
    
    var formatter: js.UndefOr[String] = js.native
    
    var fragmenter: js.UndefOr[String] = js.native
    
    var fragsize: js.UndefOr[Double] = js.native
    
    var highlightMultiTerm: js.UndefOr[Boolean] = js.native
    
    var maxAlternateFieldLength: js.UndefOr[Double] = js.native
    
    var maxAnalyzedChars: js.UndefOr[Double] = js.native
    
    var maxMultiValuedToExamine: js.UndefOr[Double] = js.native
    
    var maxMultiValuedToMatch: js.UndefOr[Double] = js.native
    
    var mergeContiguous: js.UndefOr[Boolean] = js.native
    
    var on: Boolean = js.native
    
    var payloads: js.UndefOr[Boolean] = js.native
    
    var preserveMulti: js.UndefOr[Boolean] = js.native
    
    var q: js.UndefOr[String | js.Array[String]] = js.native
    
    var qparser: js.UndefOr[String] = js.native
    
    var regexMaxAnalyzedChars: js.UndefOr[Double] = js.native
    
    var regexPattern: js.UndefOr[String] = js.native
    
    var regexSlop: js.UndefOr[Double] = js.native
    
    var requireFieldMatch: js.UndefOr[Boolean] = js.native
    
    var simplePost: js.UndefOr[String] = js.native
    
    var simplePre: js.UndefOr[String] = js.native
    
    var snippets: js.UndefOr[Double] = js.native
    
    var usePhraseHighlighter: js.UndefOr[Boolean] = js.native
  }
  object HighlightOptions {
    
    @scala.inline
    def apply(on: Boolean): HighlightOptions = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlightOptions]
    }
    
    @scala.inline
    implicit class HighlightOptionsMutableBuilder[Self <: HighlightOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlternateField(value: String): Self = StObject.set(x, "alternateField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlternateFieldUndefined: Self = StObject.set(x, "alternateField", js.undefined)
      
      @scala.inline
      def setFl(value: String | js.Array[String]): Self = StObject.set(x, "fl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlUndefined: Self = StObject.set(x, "fl", js.undefined)
      
      @scala.inline
      def setFlVarargs(value: String*): Self = StObject.set(x, "fl", js.Array(value :_*))
      
      @scala.inline
      def setFormatter(value: String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setFragmenter(value: String): Self = StObject.set(x, "fragmenter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmenterUndefined: Self = StObject.set(x, "fragmenter", js.undefined)
      
      @scala.inline
      def setFragsize(value: Double): Self = StObject.set(x, "fragsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragsizeUndefined: Self = StObject.set(x, "fragsize", js.undefined)
      
      @scala.inline
      def setHighlightMultiTerm(value: Boolean): Self = StObject.set(x, "highlightMultiTerm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightMultiTermUndefined: Self = StObject.set(x, "highlightMultiTerm", js.undefined)
      
      @scala.inline
      def setMaxAlternateFieldLength(value: Double): Self = StObject.set(x, "maxAlternateFieldLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAlternateFieldLengthUndefined: Self = StObject.set(x, "maxAlternateFieldLength", js.undefined)
      
      @scala.inline
      def setMaxAnalyzedChars(value: Double): Self = StObject.set(x, "maxAnalyzedChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAnalyzedCharsUndefined: Self = StObject.set(x, "maxAnalyzedChars", js.undefined)
      
      @scala.inline
      def setMaxMultiValuedToExamine(value: Double): Self = StObject.set(x, "maxMultiValuedToExamine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMultiValuedToExamineUndefined: Self = StObject.set(x, "maxMultiValuedToExamine", js.undefined)
      
      @scala.inline
      def setMaxMultiValuedToMatch(value: Double): Self = StObject.set(x, "maxMultiValuedToMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMultiValuedToMatchUndefined: Self = StObject.set(x, "maxMultiValuedToMatch", js.undefined)
      
      @scala.inline
      def setMergeContiguous(value: Boolean): Self = StObject.set(x, "mergeContiguous", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMergeContiguousUndefined: Self = StObject.set(x, "mergeContiguous", js.undefined)
      
      @scala.inline
      def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloads(value: Boolean): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
      
      @scala.inline
      def setPreserveMulti(value: Boolean): Self = StObject.set(x, "preserveMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveMultiUndefined: Self = StObject.set(x, "preserveMulti", js.undefined)
      
      @scala.inline
      def setQ(value: String | js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      @scala.inline
      def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
      
      @scala.inline
      def setQparser(value: String): Self = StObject.set(x, "qparser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQparserUndefined: Self = StObject.set(x, "qparser", js.undefined)
      
      @scala.inline
      def setRegexMaxAnalyzedChars(value: Double): Self = StObject.set(x, "regexMaxAnalyzedChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexMaxAnalyzedCharsUndefined: Self = StObject.set(x, "regexMaxAnalyzedChars", js.undefined)
      
      @scala.inline
      def setRegexPattern(value: String): Self = StObject.set(x, "regexPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexPatternUndefined: Self = StObject.set(x, "regexPattern", js.undefined)
      
      @scala.inline
      def setRegexSlop(value: Double): Self = StObject.set(x, "regexSlop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexSlopUndefined: Self = StObject.set(x, "regexSlop", js.undefined)
      
      @scala.inline
      def setRequireFieldMatch(value: Boolean): Self = StObject.set(x, "requireFieldMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireFieldMatchUndefined: Self = StObject.set(x, "requireFieldMatch", js.undefined)
      
      @scala.inline
      def setSimplePost(value: String): Self = StObject.set(x, "simplePost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimplePostUndefined: Self = StObject.set(x, "simplePost", js.undefined)
      
      @scala.inline
      def setSimplePre(value: String): Self = StObject.set(x, "simplePre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimplePreUndefined: Self = StObject.set(x, "simplePre", js.undefined)
      
      @scala.inline
      def setSnippets(value: Double): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      
      @scala.inline
      def setUsePhraseHighlighter(value: Boolean): Self = StObject.set(x, "usePhraseHighlighter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsePhraseHighlighterUndefined: Self = StObject.set(x, "usePhraseHighlighter", js.undefined)
    }
  }
  
  @js.native
  trait MoreLikeThisOptions extends StObject {
    
    var boost: js.UndefOr[Boolean] = js.native
    
    var count: js.UndefOr[Double] = js.native
    
    var fl: js.UndefOr[String | js.Array[String]] = js.native
    
    var maxntp: js.UndefOr[Double] = js.native
    
    var maxqt: js.UndefOr[Double] = js.native
    
    var maxwl: js.UndefOr[Double] = js.native
    
    var mindf: js.UndefOr[Double] = js.native
    
    var mintf: js.UndefOr[Double] = js.native
    
    var minwl: js.UndefOr[Double] = js.native
    
    var on: Boolean = js.native
    
    var qf: js.UndefOr[String | js.Object] = js.native
  }
  object MoreLikeThisOptions {
    
    @scala.inline
    def apply(on: Boolean): MoreLikeThisOptions = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoreLikeThisOptions]
    }
    
    @scala.inline
    implicit class MoreLikeThisOptionsMutableBuilder[Self <: MoreLikeThisOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoost(value: Boolean): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoostUndefined: Self = StObject.set(x, "boost", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setFl(value: String | js.Array[String]): Self = StObject.set(x, "fl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlUndefined: Self = StObject.set(x, "fl", js.undefined)
      
      @scala.inline
      def setFlVarargs(value: String*): Self = StObject.set(x, "fl", js.Array(value :_*))
      
      @scala.inline
      def setMaxntp(value: Double): Self = StObject.set(x, "maxntp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxntpUndefined: Self = StObject.set(x, "maxntp", js.undefined)
      
      @scala.inline
      def setMaxqt(value: Double): Self = StObject.set(x, "maxqt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxqtUndefined: Self = StObject.set(x, "maxqt", js.undefined)
      
      @scala.inline
      def setMaxwl(value: Double): Self = StObject.set(x, "maxwl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxwlUndefined: Self = StObject.set(x, "maxwl", js.undefined)
      
      @scala.inline
      def setMindf(value: Double): Self = StObject.set(x, "mindf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMindfUndefined: Self = StObject.set(x, "mindf", js.undefined)
      
      @scala.inline
      def setMintf(value: Double): Self = StObject.set(x, "mintf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMintfUndefined: Self = StObject.set(x, "mintf", js.undefined)
      
      @scala.inline
      def setMinwl(value: Double): Self = StObject.set(x, "minwl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinwlUndefined: Self = StObject.set(x, "minwl", js.undefined)
      
      @scala.inline
      def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQf(value: String | js.Object): Self = StObject.set(x, "qf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQfUndefined: Self = StObject.set(x, "qf", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var agent: js.UndefOr[String] = js.native
    
    var bigint: js.UndefOr[String] = js.native
    
    var core: js.UndefOr[String] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var solrVersion: js.UndefOr[String] = js.native
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
      def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBigint(value: String): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigintUndefined: Self = StObject.set(x, "bigint", js.undefined)
      
      @scala.inline
      def setCore(value: String): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoreUndefined: Self = StObject.set(x, "core", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSolrVersion(value: String): Self = StObject.set(x, "solrVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolrVersionUndefined: Self = StObject.set(x, "solrVersion", js.undefined)
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    def bf(functions: String): Query = js.native
    
    def boost(functions: String): Query = js.native
    
    def bq(options: js.Object): Query = js.native
    
    def build(): String = js.native
    
    def cursorMark(mark: String): Query = js.native
    
    def debugQuery(): Query = js.native
    
    def defType(`type`: String): Query = js.native
    
    def df(df: String): Query = js.native
    
    def dismax(): Query = js.native
    
    def edismax(): Query = js.native
    
    def facet(options: FacetOptions): Query = js.native
    
    def fl(fields: String): Query = js.native
    def fl(fields: js.Array[String]): Query = js.native
    
    def group(options: GroupOptions): Query = js.native
    
    def groupBy(field: String): Query = js.native
    
    def hl(options: HighlightOptions): Query = js.native
    
    def matchFilter(field: String, value: String): Query = js.native
    def matchFilter(field: String, value: js.Date): Query = js.native
    def matchFilter(field: String, value: Double): Query = js.native
    
    def mlt(options: MoreLikeThisOptions): Query = js.native
    
    def mm(minimum: String): Query = js.native
    def mm(minimum: Double): Query = js.native
    
    def pf(options: js.Object): Query = js.native
    
    def ps(slop: Double): Query = js.native
    
    def q(q: String): Query = js.native
    def q(q: js.Object): Query = js.native
    
    def qf(options: js.Object): Query = js.native
    
    def qop(op: String): Query = js.native
    
    def qs(slop: Double): Query = js.native
    
    def rangeFilter(options: js.Array[RangeFilterOption]): Query = js.native
    
    def requestHandler(handler: String): Query = js.native
    
    def rows(rows: Double): Query = js.native
    
    def set(parameters: String): Query = js.native
    
    def sort(options: js.Object): Query = js.native
    
    def start(start: Double): Query = js.native
    
    def tie(tiebreaker: Double): Query = js.native
    
    def timeout(time: String): Query = js.native
    def timeout(time: Double): Query = js.native
  }
  
  @js.native
  trait RangeFilterOption extends StObject {
    
    var end: String | Double | js.Date = js.native
    
    var field: String = js.native
    
    var start: String | Double | js.Date = js.native
  }
  object RangeFilterOption {
    
    @scala.inline
    def apply(end: String | Double | js.Date, field: String, start: String | Double | js.Date): RangeFilterOption = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeFilterOption]
    }
    
    @scala.inline
    implicit class RangeFilterOptionMutableBuilder[Self <: RangeFilterOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: String | Double | js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: String | Double | js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
