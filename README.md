# 🔤 SSD Interactive Lab: Java Interfaces & Decoupled Architecture
**Software Systems Development (CRN 12391) · Level 5**  
**The British College (Leeds Beckett University) · Sudan Pudasaini**

```
Progress: [██████████████████] Step 3 of 3 (In Progress)
```

---

## ✅ Step 2 Complete! Great job on `WordProcessor.java`!

You successfully fulfilled the `Counter` interface contract with string manipulation and character parsing logic.

Now, for the final challenge, you will implement **state encapsulation, defensive null fallback, and explore polymorphic reference types**.

---

## 🌿 Step 3 Git Workflow: Create Your Feature Branch

Before writing code for Step 3, switch to a fresh feature branch:

```bash
# 1. Ensure you have the latest updates on main
git checkout main
git pull origin main

# 2. Create and switch to your Step 3 feature branch
git checkout -b feature/step3-fallback-text
```

---

## 📝 Step 3: Encapsulation & Fallback State

Open [`src/main/java/counter/WordProcessor.java`](src/main/java/counter/WordProcessor.java) in your IDE.

In robust enterprise software, methods should handle `null` inputs gracefully rather than crashing with a `NullPointerException`. In this step, you will equip `WordProcessor` with a fallback sentence attribute that kicks in whenever a method receives `null`.

### Your Tasks:

1. **Add Encapsulated Attribute `text`:**
   * In `WordProcessor.java`, declare a private String attribute initialized to an empty string:
     ```java
     private String text = "";
     ```
   * Enforce **encapsulation**: the field must be `private` so external classes cannot mutate it directly without validation.

2. **Add Getters and Setters:**
   * Provide a getter to read the fallback text:
     ```java
     public String getText() {
         return this.text;
     }
     ```
   * Provide a setter to update the fallback text:
     ```java
     public void setText(String text) {
         this.text = text;
     }
     ```

3. **Implement Null Fallback in Counting Methods:**
   * At the beginning of `countWords`, `countLetters`, and `getLength`, check if `sentence == null`:
     ```java
     if (sentence == null) {
         sentence = this.text;
     }
     ```
   * If a caller passes `null`, the method analyzes `this.text`.
   * If a caller passes a non-null string, the method analyzes that string normally.

4. **Run and Inspect `Driver.java`:**
   Open [`src/main/java/counter/Driver.java`](src/main/java/counter/Driver.java) and run the `main()` method.
   * Notice the difference between the two declarations:
     ```java
     // Call 1: Polymorphic assignment to the interface type
     Counter wp = new WordProcessor();
     
     // Call 2: Concrete type declaration
     WordProcessor wp2 = new WordProcessor();
     wp2.setText("Default text");
     ```
   * **Reflection Question:** Why could we NOT call `wp.setText(...)` on line 1?  
     *Answer:* Because `setText()` is a specific method on `WordProcessor`, not part of the `Counter` interface contract. Programming to the interface (`Counter`) hides implementation-specific details!

---

## 🧪 How to Verify Step 3 Locally

Run all unit tests across the entire project:

```bash
mvn test
```
*(Or right-click the `src/test/java` folder in your IDE and select **Run 'All Tests'**).*

All **16 unit tests** across `Step1CounterTest`, `Step2WordProcessorTest`, and `Step3FallbackTest` should pass with green checkmarks!

---

## 🚀 How to Finish the Lab

Once all 16 tests pass locally:

```bash
# 1. Stage and commit on your feature branch
git add src/main/java/counter/WordProcessor.java
git commit -m "Step 3: Completed fallback state encapsulation and null handling"

# 2. Switch back to main and merge your feature branch
git checkout main
git merge feature/step3-fallback-text

# 3. Push main to claim your completion badge!
git push origin main
```

> [!TIP]
> After pushing, wait ~15 seconds and refresh this page on GitHub (or run `git pull` locally).  
> GitHub Actions will verify your entire lab and grant you the **Week 2 Exercise Completion Badge**!
