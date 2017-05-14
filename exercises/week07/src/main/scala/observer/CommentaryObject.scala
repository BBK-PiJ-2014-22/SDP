package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject with Commentary {
  
  var desc = ""
  
  def subscribeObserver(observer: Observer) = {
    println(observer + " subscribes from " + title)
    subscribers = subscribers :+ observer }

  def unSubscribeObserver(observer: Observer) = {
    println(observer + " unsubscribes from" + title)
    subscribers = subscribers.filter(_ == observer)}

  def notifyObservers() = {
    for (i <- subscribers) i.update(desc)
  }

  def subjectDetails: String = "subject details"
  
  def setDesc(desc: String) = {
    this.desc = desc
    notifyObservers()
  }
}
