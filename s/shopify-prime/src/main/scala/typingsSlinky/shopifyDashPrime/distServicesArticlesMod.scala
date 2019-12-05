package typingsSlinky.shopifyDashPrime

import typingsSlinky.shopifyDashPrime.distInfrastructureMod.BaseService
import typingsSlinky.shopifyDashPrime.distModelsArticleMod.Article
import typingsSlinky.shopifyDashPrime.distOptionsArticlesMod.ArticleListOptions
import typingsSlinky.shopifyDashPrime.distOptionsArticlesMod.ArticleTagListOptions
import typingsSlinky.shopifyDashPrime.distOptionsBaseMod.DateOptions
import typingsSlinky.shopifyDashPrime.distOptionsBaseMod.FieldOptions
import typingsSlinky.shopifyDashPrime.distOptionsBaseMod.ListOptions
import typingsSlinky.shopifyDashPrime.distOptionsBaseMod.PublishedOptions
import typingsSlinky.shopifyDashPrime.distServicesArticlesMod.Articles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("shopify-prime/dist/services/articles", JSImport.Namespace)
@js.native
object distServicesArticlesMod extends js.Object {
  @js.native
  class Articles protected () extends BaseService {
    def this(shopDomain: String, accessToken: String) = this()
    /**
      * Counts the articles on the given blog.
      * @param blogId Id of the blog that the articles belong to.
      * @param options Options for filtering the results.
      */
    def count(blogId: Double): js.Promise[Double] = js.native
    def count(blogId: Double, options: DateOptions with PublishedOptions): js.Promise[Double] = js.native
    /**
      * Creates a new article.
      * @param blogId Id of the blog that the article will belong to.
      * @param article The article being created.
      */
    def create(blogId: Double, article: Article): js.Promise[Article] = js.native
    /**
      * Deletes the article with the given id.
      * @param blogId Id of the blog that the article belongs to.
      * @param articleId Id of the article to delete.
      */
    def delete(blogId: Double, articleId: Double): js.Promise[Unit] = js.native
    /**
      * Gets an article with the given id.
      * @param blogId Id of the blog that the article belongs to.
      * @param articleId Id of the article being retrieved.
      * @param options Options for filtering the result.
      */
    def get(blogId: Double, articleId: Double): js.Promise[Article] = js.native
    def get(blogId: Double, articleId: Double, options: FieldOptions): js.Promise[Article] = js.native
    /**
      * Lists up to 250 articles for the given blog.
      * @param blogId Id of the blog that the articles belong to.
      * @param options Options for filtering the results.
      */
    def list(blogId: Double): js.Promise[js.Array[Article]] = js.native
    def list(
      blogId: Double,
      options: FieldOptions with DateOptions with ListOptions with PublishedOptions with ArticleListOptions
    ): js.Promise[js.Array[Article]] = js.native
    /**
      * Gets a list of all article authors.
      */
    def listAuthors(): js.Promise[js.Array[String]] = js.native
    /**
      * Gets a list of all article tags.
      * @param options Options for filtering the results.
      */
    def listTags(): js.Promise[js.Array[String]] = js.native
    def listTags(options: ArticleTagListOptions): js.Promise[js.Array[String]] = js.native
    /**
      * Gets a list of all article tags for the given blog.
      * @param blogId Id of the blog that the tags belong to.
      * @param options Options for filtering the results.
      */
    def listTagsForBlog(blogId: Double): js.Promise[js.Array[String]] = js.native
    def listTagsForBlog(blogId: Double, options: ArticleTagListOptions): js.Promise[js.Array[String]] = js.native
    /**
      * Updates an article with the given id.
      * @param blogId Id of the blog that the article belongs to.
      * @param articleId Id of the article to update.
      * @param article The updated article.
      */
    def update(blogId: Double, articleId: Double, article: Article): js.Promise[Article] = js.native
  }
  
  @js.native
  class default protected () extends Articles {
    def this(shopDomain: String, accessToken: String) = this()
  }
  
}

